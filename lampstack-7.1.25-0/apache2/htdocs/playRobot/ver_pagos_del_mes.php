<?php include_once'includes/templates/header.php'; ?>
<main class="registro">
  <?php $id_mes=($_GET['id_mes']);
  switch($id_mes){
case 1:
?><h2>Pagos de Enero</h2><?php
break;
case 2:
?><h2>Pagos de Febrero</h2><?php
break;
case 3:
?><h2>Pagos de Marzo</h2><?php
break;
case 4:
?><h2>Pagos de Abril</h2><?php
break;
case 5:
?><h2>Pagos de Mayo</h2><?php
break;
case 6:
?><h2>Pagos de Junio</h2><?php
break;
case 7:
?><h2>Pagos de Julio</h2><?php
break;
case 8:
?><h2>Pagos de Agosto</h2><?php
break;
case 9:
?><h2>Pagos de Septiembre</h2><?php
break;
case 10:
?><h2>Pagos de Octubre</h2><?php
break;
case 11:
?><h2>Pagos de Noviembre</h2><?php
break;
case 12:
?><h2>Pagos de Diciembre</h2><?php
break;
}?>
    <br></br>
  <?php

    date_default_timezone_set('America/Mexico_City');
    try{
      require_once('includes/funciones/bd_conexion.php');
      $sql=" SELECT * ";
      $sql.=" FROM pagos ";
      $sql.= "LEFT JOIN tipo_de_pago ON pagos.id_tipo_de_pago=tipo_de_pago.id_pago ";
      $sql.=" LEFT JOIN pago_con ";
      $sql.=" ON pagos.metodo_de_pago = pago_con.id_pago_con ";
      $sql.=" LEFT JOIN lista ON pagos.referencia_de_pago = lista.referencia_de_pago ";
      $sql.=" ORDER BY pagos.id_pagos ASC ";
      $resultado=$conn->query($sql);
    }catch(Exception $e){
    echo $e->getMessage();
    }
  ?>

  <div class="resultados-bd" >

    <?php
      $id_pago=0;
     while($lista = $resultado->fetch_assoc()){
       ?>
      <?php
        $mes=substr($lista['fecha_de_pago'],5,-3);
        if($mes==$id_mes):
        if($id_pago!=$lista['id_pagos']):?>
        <br></br>

        <a >

          <nav class="resultados-bd">
            <ul>
            <h3 class="texto">
          <?php echo"Fecha de pago: ". $lista['fecha_de_pago']; ?>
          <br>
          <?php echo"Concepto de pago: ". $lista['nombre_tipo_pago']; ?>
          <br>
          <?php echo"Pagó con: ". $lista['metodo_pago']; ?>
          <br>
          <?php echo"Pagó total de: $". $lista['cantidad']; ?>
          <br>
          <?php echo"Descuento: $". $lista['descuento']; ?>
            <br> <?php echo "N° de pago: ".$lista['id_pagos']; ?>
        <h3 class="texto"><?php echo $lista['nombre_alumno'].(' ').$lista['apellido_alumno']; ?></h3>
          <form  class="alumno" action="eliminar_pago.php" method="post">
            <div class="editar">
              <label></label>

              <input hidden type="text" name="id_pago" value="<?php echo $lista['id_pagos']?>" >
              <input type="submit" name="editar" class="boton-edit" value="eliminar">
            </div>
          </form>

            </h3>
            </ul>

          </nav>
          </a>
          <?php
          endif;
          endif;
          $id_pago=$lista['id_pagos'];?>
       <?php
     }
    ?>

  </div>

  <?php
    $conn->close();
  ?>
</main>
    <?php include_once'includes/templates/footer.php'; ?>
  </body>
</html>
