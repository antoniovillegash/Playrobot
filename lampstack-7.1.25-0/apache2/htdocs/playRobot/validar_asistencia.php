<?php include_once'includes/templates/header.php'; ?>
<main class="registro">
  <h2>Asistencia registrada</h2>
  <?php if(isset($_POST['submit'])):
    $alumno=$_POST['alumno'];
    $fecha=$_POST['fecha_de_asistencia'];
    $horario=$_POST['horario'];
    try{
      require_once('includes/funciones/bd_conexion.php');
      $stmt = $conn->prepare("INSERT INTO asistencias (id_del_alumno, fecha_asistencia, horario) VALUES(?,?,?) ");
      $stmt->bind_param("isi", $alumno, $fecha, $horario );
      $stmt->execute();
      $stmt->close();
      $conn->close();
    }catch(Exception $e){
    echo $e->getMessage();
    }
   ?>
<form class="" action="index.php">
  <div class="enviar">
    <label></label>
    <input type="submit" formaction="index.php" class="boton" value="continuar">
  </div>
</form>

<?php endif; ?>


</main>
    <?php include_once'includes/templates/footer.php'; ?>
  </body>
</html>
