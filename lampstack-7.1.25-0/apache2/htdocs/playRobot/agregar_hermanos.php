<?php include_once'includes/templates/header.php'; ?>
    <main class="registro">
      <h2>Agregar hermano/a</h2>
      <br></br>
      <section id="contacto" class="contacto">
        <form action="validar_hermano.php" method="post">
          <div class="contenedor-campos">
            <div class="campo w-100">
              <label>Hermano/a de:</label>
              <select class="campo" name="hermano" required>
                <?php
                  try{
                    require_once('includes/funciones/bd_conexion.php');
                    $sql=" SELECT id_alumno, nombre_alumno, apellido_alumno ";
                    $sql.=" FROM lista ";
                    $resultado=$conn->query($sql);
                  }catch(Exception $e){
                  echo $e->getMessage();
                  }
                ?>
                <div class="resultados-bd">
                  <?php
                    while ( $row = $resultado->fetch_array()){
                  ?>
                  <option value=" <?php echo $row['id_alumno'] ?> " >
                  <?php echo $row['nombre_alumno'].(' ').$row['apellido_alumno']; ?>
                     <?php
                   }
                  ?>

                </div>

              </select>
            </div>
            <div class="campo">
              <label>Nivel al que ingresa:</label>
              <select class="campo" name="nivel" required>
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
              <input type="text" name="nombre" required>
            </div>
            <div class="campo">
              <label>Apellido del alumno:</label>
              <input type="text" name="apellido" required>
            </div>
            <div class="campo">
              <label>Fecha de nacimiento:</label>
              <input type="date" name="fecha_de_nacimiento" required>
            </div>
            <div class="campo w-100">
              <label>Alergias:</label>
              <textarea name="alergias"></textarea>
            </div>
          </div>
          <div class="enviar">
            <label></label>
            <input type="submit" name="submit" class="boton" value="Registrar">
          </div>
        </form>
      </section>
    </main>
    <?php include_once'includes/templates/footer.php'; ?>
  </body>
</html>
