Documentación Breve – Aplicación Android de Registro de Recetas
1. Descripción del Proyecto
RecetasApp es una aplicación móvil desarrollada en Android Studio utilizando Kotlin y Jetpack Compose, cuyo objetivo es gestionar el registro de recetas de cocina. La aplicación permite agregar, visualizar y eliminar recetas de forma sencilla mediante una interfaz moderna basada en Material Design. Los requisitos establecidos incluyen el uso de LazyColumn, LazyRow, soporte para tema claro y oscuro y la funcionalidad de eliminación de recetas. 
2. Tecnologías Utilizadas
•	Android Studio
•	Kotlin
•	Jetpack Compose
•	Material Design 3
•	LazyColumn y LazyRow
•	State Management de Compose
Estas tecnologías fueron seleccionadas según los requisitos técnicos definidos para el trabajo práctico. 
3. Estructura del Proyecto
El proyecto está organizado de manera simple para facilitar su mantenimiento y comprensión:


 
3.1. Descripción de los Componentes
Componente	Descripción
MainActivity	Punto de entrada de la aplicación.
Receta.kt	Modelo de datos que representa una receta.
RecetasScreen	Pantalla principal con formulario y listado.
RecetaItem	Componente visual para mostrar cada receta.
Theme.kt	Configuración de tema claro y oscuro.
Color.kt	Definición de colores personalizados.

4. Funcionamiento de la Aplicación
La aplicación permite:
Registrar Recetas
El usuario ingresa:
•	Nombre del plato
•	Tiempo de preparación
•	Dificultad
•	Ingredientes principales
•	Calorías por porción
Estos datos son almacenados temporalmente en memoria y agregados a la lista visual de recetas. 
Visualizar Recetas
Las recetas se muestran mediante un LazyColumn, donde cada elemento contiene:
•	Nombre del plato destacado.
•	Información adicional presentada en un LazyRow.
•	Botón para eliminar la receta. 
Eliminar Recetas
Cada receta posee un botón Eliminar que remueve el elemento seleccionado de la lista de forma inmediata.
5. Temas de la Aplicación
La aplicación implementa un tema personalizado basado en Material Design con soporte para:
•	Modo Claro (Light Theme)
•	Modo Oscuro (Dark Theme)
El cambio de tema se adapta automáticamente a la configuración del dispositivo Android. 

6. Cómo Ejecutar la Aplicación
Requisitos
•	Android Studio Hedgehog o superior.
•	SDK Android instalado.
•	Emulador Android o dispositivo físico.
Pasos para Ejecutar
1.	Abrir Android Studio.
2.	Seleccionar Open Project.
3.	Abrir la carpeta del proyecto RecetasApp.
4.	Esperar la sincronización de Gradle.
5.	Ejecutar la aplicación presionando el botón Run (▶).
6.	Seleccionar un emulador o dispositivo Android conectado.
7.	Verificar que la aplicación se inicie correctamente.

7. Conclusión
La aplicación RecetasApp cumple con los requerimientos del trabajo práctico al permitir registrar, visualizar y eliminar recetas mediante una interfaz desarrollada en Jetpack Compose. Además, implementa correctamente los componentes LazyColumn, LazyRow, así como los modos Light y Dark Theme, proporcionando una experiencia de usuario moderna y responsiva.

