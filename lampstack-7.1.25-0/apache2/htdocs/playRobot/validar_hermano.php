
<?php include_once'includes/templates/header.php'; ?>
<main class="registro">
  <h2>Resumen de registro</h2>
  <?php if(isset($_POST['submit'])):
    $hermano=$_POST['hermano'];
    $nivel=$_POST['nivel'];
    $nombre=$_POST['nombre'];
    $apellido=$_POST['apellido'];
    $Fecha_de_nacimiento=$_POST['Fecha_de_nacimiento'];
    $alergias=$_POST['alergias'];
    $hermano=$_POST['hermano'];

    try{
      require_once('includes/funciones/bd_conexion.php');
      $stmt = $conn->prepare("INSERT INTO hermanos (id_del_hermano, id_nivel, nombre_alumno, apellido_alumno, fecha_nacimiento, alergias) VALUES(?,?,?,?,?,?)");
      $stmt->bind_param("iissss", $hermano, $nivel, $nombre, $apellido, $Fecha_de_nacimiento, $alergias);
      $stmt->execute();
      $stmt->close();
      $conn->close();
    }catch(Exception $e){
    echo $e->getMessage();
    }
   ?>

   <h3 class="texto">
     <br></br>
    <?php echo ('Nombre: '). $_POST['nombre'].(' ').$_POST['apellido'];?>
    <br></br>
    <?php echo ('Nivel: '). $_POST['nivel'];?>
    <br></br>
    <?php echo ('Id del hermano: '). $_POST['hermano'];?>
    <br></br>
    <?php echo ('Fecha de nacimiento: '). $_POST['fecha_de_nacimiento'];?>
    <br></br>
    <?php echo ('Alergias: '). $_POST['alergias'];?>
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
