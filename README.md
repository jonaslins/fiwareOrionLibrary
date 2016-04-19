##A Lightweight Java Client Library for Fiware-Orion NGSI APIv1

###Docs
Read the [Fiware-Orion](http://fiware-orion.readthedocs.org/en/1.0.0/) documentation for further usage and understanding

### Usage

Add a dependency to your `build.gradle`:
```gradle
dependencies {
    compile 'com.github.jonaslins:fiware-orion-library:0.0.1-SNAPSHOT'
}
```
As there's no release version yet, add a **SNAPSHOT** repository to your `build.gradle`:
```gradle
repositories.maven.url "https://oss.sonatype.org/content/repositories/snapshots/"
```

### Basic Example

```java
String SERVER_ADDRESS = "http://127.0.0.1:1001"

ContextElement contextElement = new ContextElement("Room", "Room1", false);
contextElement.addAttribute(new Attribute("temperature", "float", "23"));
contextElement.addAttribute(new Attribute("pressure", "integer", "720"));

UpdateContext updateContext = new UpdateContext();
updateContext.setUpdateAction(UpdateAction.APPEND);
updateContext.addContextElement(contextElement);

//Synchronous Request
Response<FiwareResponse> response = FiwareOrionClient.serverAddress(SERVER_ADDRESS)
        .updateContext(updateContext)
        .executeRequest();
        
//Asynchronous Request
FiwareOrionClient.serverAddress(SERVER_ADDRESS)
        .updateContext(updateContext)
        .asyncRequest(new FiwareCallback() {
            @Override
            public void onResponseSuccess(FiwareResponse fiwareResponse, String rawBody) {
            }
            @Override
            public void onResponseFailure(Throwable t) {
            }
        });

```
