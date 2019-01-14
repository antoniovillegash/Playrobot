<?php include_once'includes/templates/header.php'; ?>
<main class="registro">
  <h2>Asistencias</h2>
    <br></br>
  <?php
    try{
      require_once('includes/funciones/bd_conexion.php');
      $sql=" SELECT * ";
      $sql.=" FROM asistencias ";
      $sql.= "LEFT JOIN lista ON lista.id_alumno=asistencias.id_del_alumno ";
      $sql.=" LEFT JOIN nivel ";
      $sql.=" ON lista.id_nivel = nivel.id_nivel ";
      $sql.=" ORDER BY id_asistencia ASC ";
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

        <br></br>

        <a >

          <nav class="resultados-bd">
            <ul>
            <h3 class="texto">
          <?php echo"Fecha de asistencia: ". $lista['fecha_asistencia']; ?>
          <br>
          <?php echo"Nivel: ". $lista['nombre_nivel']; ?>
            <br>
        <h3 class="texto"><?php echo $lista['nombre_alumno'].(' ').$lista['apellido_alumno']; ?></h3>
          <form  class="alumno" action="eliminar_asistencia.php" method="post">
            <div class="editar">
              <label></label>
              <?php $id_asistencia=$lista['id_asistencia'];?>
              <input hidden type="text" name="id_asistencia" value="<?php echo $id_asistencia?>" >
              <input type="submit" name="editar" class="boton-edit" value="eliminar">
            </div>
          </form>

            </h3>
            </ul>

          </nav>
          </a>
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
