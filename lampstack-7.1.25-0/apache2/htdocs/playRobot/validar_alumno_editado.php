
<?php include_once'includes/templates/header.php'; ?>
<main class="registro">
  <?php if(isset($_POST['submit'])):
    $validacion;
    $nivel=$_POST['nivel'];
    $nombre=$_POST['nombre'];
    $apellido=$_POST['apellido'];
    $fecha_de_nacimiento=$_POST['fecha_de_nacimiento'];
    $alergias=$_POST['alergias'];
    $nombre_padre=$_POST['nombre_padre'];
    $telefono_padre=$_POST['telefono_padre'];
    $nombre_madre=$_POST['nombre_madre'];
    $telefono_madre=$_POST['telefono_madre'];
    $autorizadas=$_POST['autorizadas'];
    if($_POST['dulces']==="on"){
        $dulces="si";
    }else{
      $dulces="no";
    }
    if($_POST['video']==="on"){
        $video="si";
    }else{
      $video="no";
    }
    $fecha_de_pago=$_POST['fecha_de_pago'];
    if(is_numeric($fecha_de_pago) && ($fecha_de_pago>0 && $fecha_de_pago<=28)){
      $validacion=True;
    }else{
      $validacion=False;
    }
    $id_alumno=$_POST['id'];
if($validacion==True){
  ?><h2>Alumno editado</h2><?php
    try{
      require_once('includes/funciones/bd_conexion.php');
      $sql = "UPDATE lista SET id_nivel=$nivel, nombre_alumno='$nombre', apellido_alumno='$apellido', fecha_nacimiento='$fecha_de_nacimiento', alergias='$alergias', nombre_padre='$nombre_padre', nombre_madre='$nombre_madre', telefono_padre='$telefono_padre', telefono_madre='$telefono_madre', personas_autorizadas='$autorizadas', autorizacion_dulces='$dulces', autorizacion_video='$video', fecha_pago='$fecha_de_pago' WHERE id_alumno=$id_alumno ";
      $stmt=$conn->prepare($sql);
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
    <?php echo ('Fecha de nacimiento: '). $_POST['fecha_de_nacimiento'];?>
    <br></br>
    <?php echo ('Alergias: '). $_POST['alergias'];?>
    <br></br>
    <?php echo ('Padre: '). $_POST['nombre_padre'];?>
    <br></br>
    <?php echo ('Telefono: '). $_POST['telefono_padre'];?>
    <br></br>
    <?php echo ('Madre: '). $_POST['nombre_madre'];?>
    <br></br>
    <?php echo ('Telefono: '). $_POST['telefono_madre'];?>
    <br></br>
    <?php echo ('Personas autorizadas: '). $_POST['autorizadas'];?>
    <br></br>
    <?php echo ('autorización: ').('Dulces ').$dulces.(', Video ').$video;?>
    <br></br>
    <?php echo ('Fecha de pago: '). $_POST['fecha_de_pago'];?>
    <br></br>
    </h3>
<form class="" action="index.php">
  <div class="enviar">
    <label></label>
    <input type="submit" formaction="index.php" class="boton" value="continuar">
  </div>
</form>
<?php }else{?>
<h2>No se pudo registrar al alumno</h2>
<?php  }?>
<?php endif; ?>


</main>
    <?php include_once'includes/templates/footer.php'; ?>
  </body>
</html>
