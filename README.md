# CreateItem
This is Minecraft Paper API Plugin for Groovy

* [API Feauture](https://github.com/ProjectTL12345/CreateItem#api-feature)
* [API License](https://github.com/ProjectTL12345/CreateItem#api-license)
* [How to use this API in server](https://github.com/ProjectTL12345/CreateItem#how-to-use-this-api-in-server)
* [API Build](https://github.com/ProjectTL12345/CreateItem#api-build)
* [How to use this API dependency](https://github.com/ProjectTL12345/CreateItem#how-to-use-this-api-dependency)

## API Feature
* Create item
* Create custom item

## API License
This API uses the GPL-3.0 open source license.
* License: [CreateItem License](https://github.com/ProjectTL12345/CreateItem/blob/master/LICENSE)

## How to use this API in server
This is a dependency library, you must add this API to use the plugin using this dependency library.
To use a plugin using this dependency library, you need to do the following:

* Step 1: Please go to your server.
* Step 2: Please add this dependency library to your plugins folder.

If you did the above, you can use the plugin using this dependency.
### Dependency Library
* [InventoryGUI](https://github.com/ProjectTL12345/InventoryGUI)

## API Build

* Maven
```XML
<repositories>
  <repository>
    <id>jitpack.io</id>
    <url>https://jitpack.io</url>
  </repository>
</repositories>

<dependency>
  <groupId>com.github.ProjectTL12345</groupId>
  <artifactId>CreateItem</artifactId>
  <version>VERSION</version>
</dependency>
```

* Gradle (Groovy DSL)
```groovy
repositories {
  jcenter()
  maven {
    url = 'https://jitpack.io'
  }
}

dependencies {
  compileOnly 'com.github.ProjectTL12345:CreateItem:VERSION'
}
```

* Gradle (Kotlin DSL)
```kotlin
repositories {
  jcenter()
  maven("https://jitpack.io")
}

dependencies {
  jcenter()
  compileOnly("com.github.ProjectTL12345:CreateItem:VERSION")
}
```

## How to use this API dependency
### Making normal item

* Java
```Java
public void onExample(Player targetPlayer) {
  CreateItem item = new CreateItem();
  item.addItem(Material.DIAMOND_SWORD, 1, targetPlayer);
}
```

* Groovy
```Groovy
void onExample(Player targetPlayer) {
  CreateItem item = new CreateItem()
  item.addItem(Material.DIAMOND_SWORD, 1, targetPlayer)
}
```
  
* Kotlin
```Kotlin
fun onExample(targetPlayer: Player) {
  val item = CreateItem()
  item.addItem(Material.DIAMOND_SWORD, 1, targetPlayer)
}
```

* Scala
```Scala
fun onExample(targetPlayer: Player): Unit = {
  val item = CreateItem()
  item.addItem(Material.DIAMOND_SWORD, 1, targetPlayer)
}
```

### Making custom item

* Java
```Java
public void onExample(Player targetPlayer) {
  CreateItem item = new CreateItem();
  item.addCustomItem(Material.DIAMOND_SWORD, 1, targetPlayer, ChatColor.GREEN + "Test", null");
}
```

* Groovy
```Groovy
void onExample(Player targetPlayer) {
  CreateItem item = new CreateItem()
  item.addCustomItem(Material.DIAMOND_SWORD, 1, targetPlayer, "${ChatColor.GREEN}Test", null") // Parentheses can be omitted
}
```
  
* Kotlin
```Kotlin
fun onExample(targetPlayer: Player) {
  val item = CreateItem()
  item.addCustomItem(Material.DIAMOND_SWORD, 1, targetPlayer, "${ChatColor.GREEN}Test", null")
}
```

* Scala
```Scala
fun onExample(targetPlayer: Player): Unit = {
  val item = CreateItem()
  item.addCustomItem(Material.DIAMOND_SWORD, 1, targetPlayer, "${ChatColor.GREEN}Test", null")
}
```
