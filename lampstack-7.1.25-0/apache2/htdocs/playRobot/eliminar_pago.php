<?php include_once'includes/templates/header.php'; ?>
<main class="registro">
  <?php $id_pago=($_POST['id_pago']);
  try{
    require_once('includes/funciones/bd_conexion.php');
    $sql="DELETE FROM pagos WHERE id_pagos=$id_pago ";
    $resultado=$conn->query($sql);
  }catch(Exception $e){
  echo $e->getMessage();
  }
?>


<h2>Pago eliminado</h2>

<?php
  $conn->close();
?>


</main>
    <?php include_once'includes/templates/footer.php'; ?>
  </body>
</html>
