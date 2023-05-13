<h1> Creación del proyecto </h1>

Primero crearemos nuestro proyecto llamado "Archivo" junto con un JFrame Form llamado "Editor" nos queda de esta manera:

![](https://github.com/JairAlejandro1/Imagenes/blob/dfe923112a8cc52792368bac0547574fc6bc619d/p2-img1.png)

Siguiendo con el JFrame Form, colocaremos 5 elementos dentro de el que son 3 JButton, un JTextField y un JTextArea como se muestra en la imagen a continuación:

![](https://github.com/JairAlejandro1/Imagenes/blob/dfe923112a8cc52792368bac0547574fc6bc619d/p2-img2.png)

En los elementos que colocamos les pondremos los siguientes nombres para no perdernos y usarlos en nuestro codigo:

![](https://github.com/JairAlejandro1/Imagenes/blob/d10664f7c250f2e38248de339946f692009f0e8a/p2-img3.png)

<h1> Funcionalidad del boton "Archivo" </h1>

Este boton tiene como funcion buscar dentro de los archivos de la computadora el archivo que queremos utilizar usando un evento "MouseClikced", en este caso vemos la instancia JFileChooser que hace lo que se mencionó anteriormente. 
Luego en la extension pondremos el tipo de archivo que queremos que abra el programa en este caso usamos un "json".
El metodo "showOpenDialog(this)" nos abre una ventana emergente donde se nos muestran nuestros archivos para asi buscar y seleccionar el archivo "json" que queremos abrir. Por ultimo se actualiza nuestro JTextField llamado "txtArchivo" y se coloca la ruta del archivo seleccionado ademas de mandar el contenido del archivo a nuestro JTextArea llamado "txtEntrada".

```

    private void btnArchivoMouseClicked(java.awt.event.MouseEvent evt) {
      System.out.println("Inico de la carga de archivo");
        JFileChooser fc = new JFileChooser();
        FileNameExtensionFilter filter = new FileNameExtensionFilter("Archivos de texto", "json");
        fc.setFileFilter(filter);
        int seleccion = fc.showOpenDialog(this);
        if (seleccion == JFileChooser.CANCEL_OPTION) {
        } else if (seleccion == JFileChooser.APPROVE_OPTION) {
            File archivoSeleccionado = fc.getSelectedFile();
            this.txtArchivo.setText(archivoSeleccionado.getAbsolutePath());

            try (FileReader fr = new FileReader(archivoSeleccionado)) {
                String cadena = "";
                int valor = fr.read();
                while (valor != -1) {
                    cadena += (char) valor;
                    valor = fr.read();
                }
                this.txtEntrada.setText(cadena);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
        
```

<h1> Demostración </h1>

Ventana emergente.

![](https://github.com/JairAlejandro1/Imagenes/blob/bcfc96b97b0d894850ac78db4fed96514f56af2d/p2-img4.png)

Archivos "json" encontrados.

![](https://github.com/JairAlejandro1/Imagenes/blob/57149eaa0e128130b4628bbe1262af593e832eb3/p2-img6.png)

Ruta del archivo y valores de texto enviados al JTextField y JTextArea.

![](https://github.com/JairAlejandro1/Imagenes/blob/bcfc96b97b0d894850ac78db4fed96514f56af2d/p2-img5.png)

<h1> Funcionalidad del boton "Guardar" </h1>

Primero debemos de poner el evento "MouseClikced" al boton. Procedemos a explicar La funcionalidad de este boton la cual se ve al momento de editar el JTextArea, el boton como su nombre lo dice guardará lo que hayamos editado gracias al metodo "PrintWriter" que reescribirá correctamente lo que editamos en el mismo archivo "json" seleccionado.

```

private void btnGuardarMouseClicked(java.awt.event.MouseEvent evt) {
        File archivo = new File(this.txtArchivo.getText());
        PrintWriter escribir;
        try {
            escribir = new PrintWriter(archivo);
            escribir.print(txtEntrada.getText());
            escribir.close();
        } catch (FileNotFoundException ex) {

            java.util.logging.Logger.getLogger(Editor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
    }
    
```
<h1> Demostración </h1>

Edicion del archivo.

![](https://github.com/JairAlejandro1/Imagenes/blob/57149eaa0e128130b4628bbe1262af593e832eb3/p2-img7.png)

Guardamos el archivo y lo abrimos en otro editor para comprobar la funcionalidad del boton.

![](https://github.com/JairAlejandro1/Imagenes/blob/57149eaa0e128130b4628bbe1262af593e832eb3/p2-img8.png)

<h1> Funcionalidad del boton "Eliminar" </h1>}

Finalmente en el ultimo boton usamos nuevamente un evento "MouseClikced", como su nombre lo dice este boton eliminará el archivo seleccionado de tipo "json" al hacerlo saltará una ventana emergente que nos dirá si el archivo fue borrado o tuvo algun error al hacer dicha acción esto irá acompañado del nombre del archivo, de la misma forma se mostrará en la consola si fue eliminado o no.

```

 private void btnEliminarMouseClicked(java.awt.event.MouseEvent evt) {
     
        System.out.println("Inico eliminar archivo");
        File archivo = new File(this.txtArchivo.getText());
        if (archivo.delete()) {
            System.out.println("Archivo borrado: " + archivo.getName());
            JOptionPane.showMessageDialog(null, "Archivo " + ""+ archivo.getName() + " eliminado");
        } else {
            System.out.println("Error al borrar el archivo");
            JOptionPane.showMessageDialog(null, "Error al eliminar el archivo: " + ""+ archivo.getName());
        }

    }

```

<h1> Demostración </h1>

Aqui se ve el nombre del archivo que vamos a eliminar

![](https://github.com/JairAlejandro1/Imagenes/blob/9ce1897406e01626c85dbfa6be3c548ca8f5d587/p2-img9.png)

Aqui vemos que se encuentra activo en los archivos locales de la computadora

![](https://github.com/JairAlejandro1/Imagenes/blob/9ce1897406e01626c85dbfa6be3c548ca8f5d587/p2-img10.png)

Procedemos a presionar el boton "Eliminar" y nos salta la alerta de que el archivo fue eliminado

![](https://github.com/JairAlejandro1/Imagenes/blob/d818da77af58eaec95ae2b60245c6e1dea746c52/p2-img11.png)

Revisamos que el archivo no este en los archivos locales de la computadora

![](https://github.com/JairAlejandro1/Imagenes/blob/d818da77af58eaec95ae2b60245c6e1dea746c52/p2-img12.png)

Por ultimo vemos que si tratamos de Re-eliminar el archivo ya eliminado nos salta una alerta de error

![](https://github.com/JairAlejandro1/Imagenes/blob/d818da77af58eaec95ae2b60245c6e1dea746c52/p2-img13.png)


