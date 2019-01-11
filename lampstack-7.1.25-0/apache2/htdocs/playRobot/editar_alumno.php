<?php include_once'includes/templates/header.php'; ?>
    <main class="registro">
      <h2>Registrar alumno</h2>
      <section id="contacto" class="contacto">
        <form action="validar_registro.php" method="post">
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
                  <option value=" <?php echo $row['id_nivel'] ?> " >
                  <?php echo $row['nombre_nivel']; ?>
                     <?php
                   }
                  ?>

                </div>
                <?php
                  $conn->close();
                ?>
              </select>
            </div>
            <div class="campo">
              <label>Nombre del alumno:</label>
              <input type="text" name="nombre" required >
            </div>
            <div class="campo">
              <label>Apellido del alumno:</label>
              <input type="text" name="apellido" required>
            </div>
            <div class="campo">
              <label>Fecha de nacimiento:</label>
              <input type="date" name="Fecha_de_nacimiento" required>
            </div>
            <div class="campo w-100">
              <label>Alergias:</label>
              <textarea name="alergias"></textarea>
            </div>
            <div class="campo w-100">
              <label>Nombre del padre:</label>
              <input type="text" name="nombre_padre">
            </div>
            <div class="campo ">
              <label>Telefono del padre:</label>
              <input type="text" name="telefono_padre" >
            </div>
            <div class="campo w-100">
              <label>Nombre de la madre:</label>
              <input type="text" name="nombre_madre" >
            </div>
            <div class="campo ">
              <label>Telefono de la madre:</label>
              <input type="text" name="telefono_madre" >
            </div>
            <div class="campo">
              <label>Personas autorizadas:</label>
              <input type="text" name="autorizadas" >
            </div>
            <div class="campo">
              <label>Comer dulces:</label>
              <input type="checkbox" name="dulces" >
            </div>
            <div class="campo">
              <label>Toma de videos/Fotos:</label>
              <input type="checkbox" name="video" >
            </div>
            <div class="campo">
              <label>Inscripción:</label>
              <input type="text" name="inscripcion" >
            </div>
            <div class="campo">
              <label>Fecha de pago:</label>
              <input type="text" name="fecha_de_pago" required>
            </div>

          </div>
          <div class="enviar">
            <label></label>
            <input type="submit" name="submit"class="boton" value="Registrar">
          </div>
        </form>
      </section>
    </main>
    <?php include_once'includes/templates/footer.php'; ?>
  </body>
</html>
