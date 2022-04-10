package CalculoCircunferencia.ExemploV_03.Util;

//Transformando os metodos  em Staticos
//COMO A CALCULADORA É UMA CLASSE UTILITARIA COM OPERAÇÕES E CLASSES ESTATICAS
//PODE DELCARAR TODS COMO STATICS E USAR DIRETAMENTE AS OPERAÇÕES E CONSTANTES ATRAVEZ DA CLASSE.

public class Calculadora {
    public static final double PI = 3.14159;

    public static double circunferencia(double raio){
        return 2.0 * PI * raio;
    }

    public static  double volume(double raio){
        return 4.0 * PI * raio * raio * raio / 3.0;
    }
}
