<?php include_once'includes/templates/header.php'; ?>
    <main>
      <div class="registro ">
      <h2>Hola <?php echo $_SESSION['nombre_usuario']; ?></h2>
</div>

  <?php
    date_default_timezone_set('America/Mexico_City');
    $id_mes=date(m);
    $id_dia=date(d);
    $id_dia_mes=$id_mes.('-').$id_dia;
    try{
      require_once('includes/funciones/bd_conexion.php');
      $sql=" SELECT id_alumno, nombre_alumno, apellido_alumno, nombre_nivel, fecha_nacimiento ";
      $sql.=" FROM lista ";
      $sql.=" INNER JOIN nivel ";
      $sql.=" ON lista.id_nivel = nivel.id_nivel ";
      $sql.=" ORDER BY nombre_nivel ASC, id_alumno ASC";
      $resultado=$conn->query($sql);
    }catch(Exception $e){
    echo $e->getMessage();
    }
  ?>


    <?php
     while($lista = $resultado->fetch_assoc()){
      $cumpleanos=substr($lista['fecha_nacimiento'],-5);
      if($cumpleanos==$id_dia_mes){
       ?>
    <div class="login">
      <h2>cumpleaños</h2>
        <br>
              <h3 class="texto">
                  <?php echo $lista['nombre_alumno'].(' ').$lista['apellido_alumno'].(' ').$lista['fecha_nacimiento']; ?>
                  <br>

            </h3>
  </div>
       <?php
     }
    ?>
<?php
} ?>
<?php
  $conn->close();
?>
<div class="invisible">
</div>
    </main>
    <?php include_once'includes/templates/footer.php'; ?>
  </body>
</html>
