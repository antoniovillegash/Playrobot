<?php include_once'includes/templates/header_login.php'; ?>
<main class="registro">
  <?php if(isset($_POST['submit'])):
      session_start();
      $usuario=$_POST['usuario'];
      $password=$_POST['contrasena'];


    try{
      require_once('includes/funciones/bd_conexion.php');
      $consulta =" SELECT nombre_usuario, usuario, contrasena FROM usuarios WHERE usuario='$usuario' AND contrasena='$password' ";
      $resultado=$conn->query($consulta);

      if(mysqli_num_rows($resultado)>0){
      $_SESSION['usuario']=$usuario;
      while($lista = $resultado->fetch_assoc()){
        $_SESSION['nombre_usuario']=$lista['nombre_usuario'];
      }
      header("location:index.php");
      session_write_close();
}else{
?> <h2><?php echo "Error de inicio de sesión"; ?></h3> <?php

}
      $conn->close();
    }catch(Exception $e){
    echo $e->getMessage();
    }
   ?>
<div class="">
  <h3 class="texto">
</div>

<?php endif; ?>


</main>
    <?php include_once'includes/templates/footer.php'; ?>
  </body>
</html>
