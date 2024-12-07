package Decorator;

/*
* Das Component-Interface im Decorator-Pattern definiert die Methode, die von
* konkreten Komponenten und Dekoratoren implementiert wird.
* Es stellt sicher, dass sowohl die Basiskomponente als auch die Dekoratoren dieselbe
* Schnittstelle haben, sodass Dekoratoren die Basiskomponente erweitern können, ohne
* deren Schnittstelle zu ändern.
* */
public interface Component {
    //Führt eine Operation aus, die von konkreten Komponenten und Dekoratoren implementiert wird.
    void operation();
}
