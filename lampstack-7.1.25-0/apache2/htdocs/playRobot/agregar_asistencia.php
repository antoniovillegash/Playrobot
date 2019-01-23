<?php include_once'includes/templates/header.php'; ?>
    <main class="registro">
      <h2>Agregar asistencia</h2>
      <br></br>
      <section id="contacto" class="contacto">
        <form action="validar_asistencia.php" method="post">
          <div class="contenedor-campos">
            <div class="campo w-100">
              <label>Alumno:</label>
              <select class="campo" name="alumno" required>
                <?php
                  try{
                    require_once('includes/funciones/bd_conexion.php');
                    $sql=" SELECT nombre_alumno, apellido_alumno, id_alumno ";
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
            <div class="contenedor-campos">
              <div class="campo w-100">
                <label>Horario:</label>
                <select class="campo" name="horario" required>
                  <?php
                    try{
                      require_once('includes/funciones/bd_conexion.php');
                      $sql=" SELECT horario, id_horario ";
                      $sql.=" FROM horarios ";
                      $resultado=$conn->query($sql);
                    }catch(Exception $e){
                    echo $e->getMessage();
                    }
                  ?>
                  <div class="resultados-bd">
                    <?php
                      while ( $row = $resultado->fetch_array()){
                    ?>
                    <option value=" <?php echo $row['id_horario'] ?> " >
                    <?php echo $row['horario']; ?>
                       <?php
                     }
                    ?>

                  </div>


                </select>

              </div>
                <?php
                  $conn->close();
                ?>
              </select>
            </div>
            <br></br>
            <div class="campo w-100">
              <label>Fecha de asistencia:</label>
              <input type="date" name="fecha_de_asistencia" required>


            </div>
            <div class="campo w-100">
              <input hidden>


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
