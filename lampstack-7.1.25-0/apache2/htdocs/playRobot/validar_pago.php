<?php include_once'includes/templates/header.php'; ?>
<main class="registro">
  <h2>Resumen de registro</h2>
  <?php if(isset($_POST['submit'])):
    $tipo_de_pago=$_POST['pago'];
    $cantidad=$_POST['pago_total'];
    $descuento=$_POST['descuento'];
    $fecha_de_pago=$_POST['fecha_de_pago'];
    $referencia_de_pago=$_POST['alumno'];
    $metodo_de_pago=$_POST['metodo_pago'];
    try{
      require_once('includes/funciones/bd_conexion.php');
      $stmt = $conn->prepare("INSERT INTO pagos (id_tipo_de_pago, cantidad, descuento, referencia_de_pago, metodo_de_pago, fecha_de_pago) VALUES(?,?,?,?,?,?)");
      $stmt->bind_param("iddiis", $tipo_de_pago, $cantidad, $descuento, $referencia_de_pago, $metodo_de_pago, $fecha_de_pago);
      $stmt->execute();
      $stmt->close();
      $conn->close();
    }catch(Exception $e){
    echo $e->getMessage();
    }
   ?>

   <h3 class="texto">
     <br></br>
    <?php echo ('concepto de pago: '). $tipo_de_pago;?>
    <br></br>
    <?php echo ('total: '). $cantidad;?>
    <br></br>
    <?php echo ('descuento: '). $descuento;?>
    <br></br>
    <?php echo ('fecha de pago: '). $fecha_de_pago;?>
    <br></br>
    <?php echo ('referencia: '). $referencia_de_pago;?>
    <br></br>
    <?php echo ('metodo de pago: '). $metodo_de_pago;?>
    </h3>
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
