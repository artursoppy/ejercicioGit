# Pasos

1. Creo el proyecto ejercicioGit vacío y sin inicializar Git

2. Inicializo Git y hago el primer add y commit

```bash
$ git init
$ git add .
$ git commit -m "creo un proyecto limpio con IntelliJ"
```

3. Ejecuto el main, con lo que se me crea una carpeta "out" en el proyecto

4. Hago un add y commit

```bash
$ git add .
$ git commit -m "acabo de ejecutar el main"
```

5. Para evitar que el out se incluya en el repositiorio creo un archvio .gitignore y dentro de este escribo "out/"

6. Hago un add y un commit


```bash
$ git add .
$ git commit -m "añadido gitignore"
```

7. Creo el programa (está copiado desde el commit original)

8. Hago un add y un commit

```bash
$ git add .
$ git commit -m "programa que crea y muestra un objeto empleado"
```

9. Como el directorio out de cuando el commit "acabo de ejecutar el main" sigue ahí lo borro.

10. Hago un add y un commit

```bash
$ git add .
$ git commit -m "eliminado directorio out"
```

11. Creo un archivo README.md

12. Hago un add y un commit

```bash
$ git add .
$ git commit -m "añadido el README"
```

13. Introduzco el problema a solcuionar (copiado del archivo original)

14. Hago un add y un commit


```bash
$ git add .
$ git commit -m "introducido problema a solucionar"
```
