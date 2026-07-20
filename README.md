# Llanquihue Tour, Entrega final.

La aplicación permite administrar clientes, paquetes turísticos y reservas mediante una interfaz. El sistema implementa operaciones varias y permite cargar información inicial desde archivos de texto.

# Funcionalidades

El sistema permite:

- Gestionar clientes.
- Gestionar paquetes turísticos.
- Gestionar reservas.
- Cargar información desde archivos TXT.
- Buscar, agregar, modificar, eliminar y visualizar registros.

# Estructura del proyecto

LlanquihueTourFINAL
│
├── src
│   └── main
│       └── java
│           └── cl
│               └── llanquihuetour
│                   │
│                   ├── app
│                   │   ├── Main.java
│                   │   └── MainPanel.java
│                   │
│                   ├── data
│                   │   ├── GestorPaquetes.java
│                   │   ├── GestorPersonas.java
│                   │   └── GestorReservas.java
│                   │
│                   ├── files
│                   │   ├── clientes.txt
│                   │   ├── paquetes.txt
│                   │   └── reservas.txt
│                   │
│                   ├── model
│                   │   ├── Cliente.java
│                   │   ├── Direccion.java
│                   │   ├── GuiaTuristico.java
│                   │   ├── PaqueteTuristico.java
│                   │   ├── Persona.java
│                   │   ├── Proveedor.java
│                   │   ├── Registro.java
│                   │   ├── Reserva.java
│                   │   ├── Rut.java
│                   │   └── Tarjeta.java
│                   │
│                   └── utils
│                       ├── LectorTXT.java
│                       ├── RutInvalidoException.java
│                       └── ValidadorRUT.java
│
├── target
│
├── nbactions.xml
│
└── pom.xml

# Archivos de datos

Para cargar la información inicial del sistema se utilizan los archivos:
src/main/java/cl/llanquihuetour/files/

-----
clientes.txt
paquetes.txt
reservas.txt
-----

# Ejecución

1. Abrir el proyecto como un proyecto Maven en NetBeans.
2. Verificar que la estructura de carpetas sea correcta.
3. Ejecutar *Clean and Build*.
4. Ejecutar la aplicación.
5. Presionar el botón *Cargar Archivos* para importar la información inicial.
6. Utilizar la interfaz para administrar clientes, paquetes turísticos y reservas.
