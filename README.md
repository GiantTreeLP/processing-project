# Processing sample projects

Sample projects for Processing for use in IntelliJ IDEA.

It's as simple as it sounds: Just copy the code and begin programming!

___

To configure the libraries, follow these simple steps:

1. Open up the *Project Structure* (Ctrl+Alt+Shift+S):  
![CTRL+ALT+SHIFT+S](img/project-structure.png)

1. Go to *Global Libraries*:  
![Global Libraries](img/global-libs.png)

1. Add the needed libraries using Maven:  
![Add from Maven](img/add-from-maven.png)

    1. Search and add `org.jogamp.gluegen:gluegen-rt`:  
    ![Add gluegen-rt](img/add-gluegen.png)
    Repeat this step for `org.jogamp.jogl:jogl-all` and `org.processing:core`.  
    Use the latest version available or any one you like.
    
1. Switch to *Modules*:  
   ![Switch to Modules](img/modules.png)

    1. Add the libraries you just downloaded:  
    
        1. Add the libraries:  
        ![Add libraries](img/add-to-module.png)
        
        1. Select the libraries:  
        ![Select libraries](img/add-libraries.png)
    
        1. Hit OK:  
        ![Hit OK!](img/hit-ok.png)
    
1. Launch the sample:  
![Launch the sample](img/launch-sample.png)
