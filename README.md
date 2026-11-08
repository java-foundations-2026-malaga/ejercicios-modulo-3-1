# JFo 3-1 - En que consiste una variable

Esta carpeta contiene 15 actividades autocorregibles del modulo 3.

## Actividades

01. Corrige las variables mal declaradas
02. Corrige los tipos incompatibles
03. Corrige los nombres de variables invalidos
04. Corrige un programa con variables no inicializadas
05. Corrige la reutilizacion incorrecta de variables
06. Crea una ficha personal
07. Crea una ficha de producto
08. Crea un programa de datos de una mascota
09. Crea variables para una pelicula
10. Crea un programa con cambio de valor
11. Calcula datos de un estudiante
12. Genera una tarjeta de empleado
13. Simula el estado de un videojuego
14. Crea una factura basica con variables
15. Reescribe un programa sin valores repetidos

Cada subcarpeta `actividadNN` es un proyecto Maven independiente con tests JUnit 5 y workflow de GitHub Actions.

## Cómo entregar las actividades

La rama `main` está protegida: contiene los enunciados originales y no se puede modificar.
Cada alumno trabaja en **su propia rama**, con su nombre.

1. Clona el repositorio:
   `git clone https://github.com/java-foundations-2026-malaga/REPOSITORIO.git`
2. Crea tu rama con tu nombre y apellido, en minúsculas y sin tildes ni espacios (por ejemplo `juan-perez`):
   `git checkout -b juan-perez`
   (En Eclipse: botón derecho sobre el proyecto > `Team > Switch To > New Branch...`).
3. Importa en Eclipse la carpeta `actividadNN` que vayas a hacer (`File > Import... > Maven > Existing Maven Projects`), resuélvela y comprueba los tests con `Run As > JUnit Test`.
4. Haz commit y sube **tu rama**:
   `git add .` → `git commit -m "Actividad NN"` → `git push -u origin juan-perez`
   (En Eclipse: `Git Staging` > `Commit and Push...`).
5. En la pestaña **Actions** del repositorio verás el resultado de la autocorrección de cada actividad que hayas modificado: ✅ aprobada o ❌ con los errores.

Si al hacer push te aparece un error sobre `main`, es que estás en la rama equivocada: cambia a tu rama con `git checkout juan-perez`.
