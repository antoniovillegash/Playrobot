
<?php include_once'includes/templates/header.php'; ?>
<main class="registro">
  <h2>Resumen de registro</h2>
  <?php if(isset($_POST['submit'])):


    $hermano=$_POST['hermano'];
    try{
      require_once('includes/funciones/bd_conexion.php');
      $sql=" SELECT * ";
      $sql.=" FROM lista ";
      $sql.=" WHERE id_alumno=$hermano ";
      $resultado=$conn->query($sql);
    }catch(Exception $e){
    echo $e->getMessage();
    }

    ?>

    <div class="resultados-bd" >

    <?php

     while($lista = $resultado->fetch_assoc()){
          $nombre_padre=$lista['nombre_padre'];
          $telefono_padre=$lista['telefono_padre'];
          $nombre_madre=$lista['nombre_madre'];
          $telefono_madre=$lista['telefono_madre'];
          $autorizadas=$lista['personas_autorizadas'];
          $dulces=$lista['autorizacion_dulces'];
          $video=$lista['autorizacion_video'];
          $fecha_de_pago=$lista['fecha_pago'];
          $referencia_de_pago=$lista['referencia_de_pago'];
     }


    $nivel=$_POST['nivel'];
    $nombre=$_POST['nombre'];
    $apellido=$_POST['apellido'];
    $fecha_de_nacimiento=$_POST['fecha_de_nacimiento'];
    $alergias=$_POST['alergias'];

    try{
      require_once('includes/funciones/bd_conexion.php');
      $stmt = $conn->prepare("INSERT INTO lista (id_nivel, nombre_alumno, apellido_alumno, fecha_nacimiento, alergias, nombre_padre, nombre_madre, telefono_padre, telefono_madre, personas_autorizadas, autorizacion_dulces, autorizacion_video, fecha_pago, referencia_de_pago) VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
      $stmt->bind_param("issssssssssssi", $nivel, $nombre, $apellido, $fecha_de_nacimiento, $alergias, $nombre_padre, $nombre_madre, $telefono_padre, $telefono_madre, $autorizadas, $dulces, $video, $fecha_de_pago, $referencia_de_pago);
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
