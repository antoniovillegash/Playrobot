<?php include_once'includes/templates/header.php'; ?>
<main class="registro">
  <?php $id_alumno=($_POST['id_alumno']);
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


</div>
<h2>Editar alumno</h2>
<section id="contacto" class="contacto">
  <form class="formulario" action="validar_alumno_editado.php" method="post">
    <div class="contenedor-campos">
      <div class="campo">
        <label>Nivel al que ingresa:</label>
        <select class="campo" name="nivel">
          <?php
            try{
              require_once('includes/funciones/bd_conexion.php');
              $sql=" SELECT id_nivel, nombre_nivel";
              $sql.=" FROM nivel ";
              $resultado=$conn->query($sql);
            }catch(Exception $e){
            echo $e->getMessage();
            }
          ?>
          <div class="resultados-bd">
            <?php
              while ( $row = $resultado->fetch_array()){
            ?>
            <option value=" <?php echo $row['id_nivel'] ?> " <?php if($row['id_nivel']==$lista['id_nivel']){

echo "selected";} ?> >
            <?php echo $row['nombre_nivel']; ?>
               <?php
             }
            ?>

          </div>

        </select>

      </div>
      <div class="campo">
        <label>Nombre del alumno:</label>
        <input type="text" name="nombre" value="<?php echo $lista['nombre_alumno']; ?>" required >
        <input hidden type="text" name="id" value="<?php echo $lista['id_alumno']; ?>" >
        <input hidden type="text" name="referencia" value="<?php echo $lista['referencia_de_pago']; ?>">
      </div>
      <div class="campo">
        <label>Apellido del alumno:</label>
        <input type="text" name="apellido" value="<?php echo $lista['apellido_alumno']; ?>" required>
      </div>
      <div class="campo">
        <label>Fecha de nacimiento:</label>
        <input type="date" name="fecha_de_nacimiento" value="<?php echo $lista['fecha_nacimiento']; ?>" required>
      </div>
      <div class="campo w-100">
        <label>Alergias:</label>
        <input type="text" name="alergias" value="<?php echo $lista['alergias']; ?>">
      </div>
      <div class="campo w-100">
        <label>Nombre del padre:</label>
        <input type="text" name="nombre_padre" value="<?php echo $lista['nombre_padre']; ?>">
      </div>
      <div class="campo ">
        <label>Telefono del padre:</label>
        <input type="text" name="telefono_padre"value="<?php echo $lista['telefono_padre']; ?>" >
      </div>
      <div class="campo w-100">
        <label>Nombre de la madre:</label>
        <input type="text" name="nombre_madre" value="<?php echo $lista['nombre_madre']; ?>">
      </div>
      <div class="campo ">
        <label>Telefono de la madre:</label>
        <input type="text" name="telefono_madre" value="<?php echo $lista['telefono_madre']; ?>">
      </div>
      <div class="campo">
        <label>Personas autorizadas:</label>
        <input type="text" name="autorizadas" value="<?php echo $lista['personas_autorizadas']; ?>">
      </div>
      <div class="campo">
        <label>Comer dulces:</label>
        <input type="checkbox" name="dulces" <?php
          if($lista['autorizacion_dulces']==="si"){
            echo "checked";
}else {
}?>>
      </div>
      <div class="campo">
        <label>Toma de videos/Fotos:</label>
        <input type="checkbox" name="video" <?php
          if($lista['autorizacion_video']==="si"){
            echo "checked";
}else {
}?>>
      </div>

      <div class="campo">
        <label>Fecha de pago:</label>
        <input type="text" name="fecha_de_pago" value="<?php echo $lista['fecha_pago']; ?>" required>
      </div>

    </div>
    <div class="enviar">
      <label></label>
      <input type="submit" name="submit"class="boton" value="Guardar">
    </div>
  </form>
</section>
<?php
}
?>
<?php
  $conn->close();
?>


</main>
    <?php include_once'includes/templates/footer.php'; ?>
  </body>
</html>
