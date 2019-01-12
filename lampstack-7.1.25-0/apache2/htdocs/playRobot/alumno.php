<?php include_once'includes/templates/header.php'; ?>
<main class="registro">
  <?php $id_alumno=($_GET['id_alumno']);
  try{
    require_once('includes/funciones/bd_conexion.php');
    $sql=" SELECT * ";
    $sql.=" FROM lista ";
    $sql.=" INNER JOIN nivel ";
    $sql.=" ON lista.id_nivel = nivel.id_nivel ";
    $sql.=" WHERE id_alumno=$id_alumno ";
    $resultado=$conn->query($sql);
  }catch(Exception $e){
  echo $e->getMessage();
  }
?>

<div class="resultados-bd" >

  <?php
   while($lista = $resultado->fetch_assoc()){
     ?>
      <h2><?php echo $lista['nombre_alumno'].(' ').$lista['apellido_alumno'];?></h2>
      <h3 class="texto">
        <br></br>
        <?php echo ('Nivel: '). $lista['nombre_nivel'];?>
        <br></br>
        <?php echo ('Fecha de nacimiento: '). $lista['fecha_nacimiento'];?>
        <br></br>
        <?php echo ('Alergias: '). $lista['alergias'];?>
        <br></br>
        <?php echo ('Padre: '). $lista['nombre_padre'];?>
        <br></br>
        <?php echo ('Telefono: '). $lista['telefono_padre'];?>
        <br></br>
        <?php echo ('Madre: '). $lista['nombre_madre'];?>
        <br></br>
        <?php echo ('Telefono: '). $lista['telefono_madre'];?>
        <br></br>
        <?php echo ('Personas autorizadas: '). $lista['personas_autorizadas'];?>
        <br></br>
        <?php echo ('autorización: ').('Dulces ').$lista['autorizacion_dulces'].(', Video ').$lista['autorizacion_video'];?>
        <br></br>
        <?php echo ('Fecha de pago: '). $lista['fecha_pago'];?>
        <br></br>
        <?php echo ('Inscripción: '). $lista['inscripcion'];?>
      </h3>
     <?php
   }
  ?>
  <?php
    $conn->close();
  ?>
</div>



</main>
    <?php include_once'includes/templates/footer.php'; ?>
  </body>
</html>
