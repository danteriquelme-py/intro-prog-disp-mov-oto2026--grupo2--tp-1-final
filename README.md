# RecetasApp 🍳 - Aplicación Android de Registro de Recetas

Aplicación móvil desarrollada para Android utilizando **Kotlin** y **Jetpack Compose**, diseñada para gestionar el registro de recetas de cocina mediante una interfaz moderna basada en **Material Design 3**.

Este proyecto cumple con los requisitos técnicos establecidos para el trabajo práctico, implementando componentes reactivos, listas optimizadas y soporte completo para temas visuales.

---

## 🛠️ Tecnologías Utilizadas

*   **Lenguaje:** Kotlin
*   **Framework de UI:** Jetpack Compose (Material Design 3)
*   **Estructura de Datos en UI:** LazyColumn y LazyRow
*   **Gestión de Estado:** State Management de Compose (`mutableStateOf`, `remember`)
*   **IDE de Desarrollo:** Android Studio

---

## 📂 Estructura del Proyecto

A continuación se detalla la estructura de paquetes y archivos del proyecto `com.recetasapp`:

```text
com.recetasapp
│
├── MainActivity.kt
│
├── model
│   └── Receta.kt
│
├── viewmodel
│   └── RecetaViewModel.kt
│
├── ui
│   ├── screen
│   │   └── RecetaScreen.kt
│   │
│   ├── components
│   │   └── RecetaItem.kt
│   │
│   └── theme
│       ├── Color.kt
│       ├── Theme.kt
│       └── Type.kt
```

### 3.1. Descripción de los Componentes

| Componente | Descripción |
| :--- | :--- |
| **MainActivity** | Punto de entrada de la aplicación en Android. |
| **Receta.kt** | Modelo de datos que representa una receta (nombre, tiempo, dificultad, ingredientes, calorías). |
| **RecetaViewModel.kt**| Gestiona el estado de la aplicación y la lógica de negocio (agregar y eliminar recetas). |
| **RecetaScreen.kt** | Pantalla principal que contiene el formulario de registro y el listado de recetas. |
| **RecetaItem.kt** | Componente visual individual para mostrar la información detallada de cada receta. |
| **Theme.kt** | Configuración de tema claro (Light Theme) y oscuro (Dark Theme). |
| **Color.kt** | Definición de la paleta de colores personalizados para Material 3. |
| **Type.kt** | Configuración tipográfica de la aplicación. |

---

## ⚙️ Funcionamiento de la Aplicación

La aplicación permite realizar de forma dinámica las siguientes acciones:

1.  **Registrar Recetas:**
    El usuario ingresa a través del formulario:
    *   Nombre del plato
    *   Tiempo de preparación
    *   Dificultad
    *   Ingredientes principales
    *   Calorías por porción
    
    *Los datos son almacenados temporalmente en memoria mediante el estado de Compose y se agregan reactivamente a la lista visual.*

2.  **Visualizar Recetas:**
    Las recetas registradas se despliegan eficientemente mediante un **LazyColumn**. Cada fila contiene:
    *   Nombre del plato destacado.
    *   Información adicional (tiempo, dificultad, calorías) presentada de forma horizontal en un **LazyRow**.
    *   Un botón de acción directa para eliminar.

3.  **Eliminar Recetas:**
    Cada elemento del listado posee un botón **Eliminar** que remueve el objeto seleccionado de la lista mutable del estado de forma inmediata, actualizando la interfaz automáticamente.

---

## 🎨 Temas de la Aplicación

La aplicación implementa un diseño responsivo y moderno adaptado a las directrices de **Material Design 3**, con soporte nativo para:

*   **Modo Claro (Light Theme)**
*   **Modo Oscuro (Dark Theme)**

*El cambio de tema se adapta automáticamente según las preferencias globales del sistema del dispositivo Android.*

---

## 🚀 Cómo Ejecutar la Aplicación

### Requisitos Previos
*   **Android Studio** Hedgehog (2023.1.1) o superior.
*   **SDK Android** instalado y configurado.
*   **Emulador Android** (AVD) o un dispositivo físico con la Depuración USB activada.

### Pasos para la Ejecución
1.  Abrir **Android Studio**.
2.  Seleccionar la opción **Open Project** (o *File > Open*).
3.  Seleccionar la carpeta raíz del proyecto **RecetasApp**.
4.  Esperar a que finalice el proceso de sincronización e indexación de **Gradle**.
5.  Ejecutar la aplicación presionando el botón **Run** (▶) en la barra superior.
6.  Seleccionar el emulador o el dispositivo físico conectado.
7.  Verificar que la aplicación compile y se inicie correctamente en pantalla.

---

## 📝 Conclusión

La aplicación **RecetasApp** cumple de forma íntegra con los requerimientos académicos establecidos. A través del uso de herramientas modernas como **Jetpack Compose**, la implementación de contenedores optimizados (**LazyColumn** y **LazyRow**), la correcta separación de responsabilidades y el soporte adaptativo para **Dark/Light Mode**, se logra un producto interactivo, eficiente y con una excelente experiencia de usuario.
