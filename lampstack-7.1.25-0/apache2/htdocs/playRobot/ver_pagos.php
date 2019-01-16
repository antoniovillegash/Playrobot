<?php include_once'includes/templates/header.php'; ?>
<main class="registro">
  <h2>Ver pagos</h2>
    <br></br>
  <?php
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
      <?php if($id_pago!=$lista['id_pagos']):?>
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

              <input hidden type="text" name="id_pago" value="<?php echo $id_pago?>" >
              <input type="submit" name="editar" class="boton-edit" value="eliminar">
            </div>
          </form>

            </h3>
            </ul>

          </nav>
          </a>
          <?php
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
