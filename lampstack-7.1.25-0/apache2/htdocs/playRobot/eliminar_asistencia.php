<?php include_once'includes/templates/header.php'; ?>
<main class="registro">
  <?php $id_asistencia=($_POST['id_asistencia']);
  try{
    require_once('includes/funciones/bd_conexion.php');
    $sql="DELETE FROM asistencias WHERE id_asistencia=$id_asistencia ";
    $resultado=$conn->query($sql);
  }catch(Exception $e){
  echo $e->getMessage();
  }
?>


<h2>Asistencia eliminada</h2>

<?php
  $conn->close();
?>


</main>
    <?php include_once'includes/templates/footer.php'; ?>
  </body>
</html>
