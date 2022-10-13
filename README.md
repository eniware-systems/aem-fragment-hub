# AEM FragmentHub

# Quick start

To build the full bundle (model, Code generator, CLI tools and the standalone Eclipse Editor) just run:

```
cd de.enithing.fragmenthub.parent
mvn clean install
```

You can also only build certain components to speed up the process:

```
cd de.enithing.fragmenthub.parent

# Only build the model (this is required by all other components and must be built first!)
mvn clean install -Pmodel 

# Build the importer and generator cores (required by the cli-tools)
mvn clean install -Pgenerator

# Build the importer and generator CLI tools
mvn clean install -Pcli-tools

# Build the standalone Eclipse Editor product
mvn clean install -Pproduct
```
