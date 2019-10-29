package com.devco.unittest;

import static org.hamcrest.Matchers.equalTo;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;
import org.mockito.Spy;
import org.springframework.test.context.event.annotation.BeforeTestMethod;

import static org.hamcrest.MatcherAssert.assertThat;


public class CalculadoraTest {


    Calculadora calculadora;

    @Before
    public void setUp(){
        calculadora = new Calculadora();
        calculadora = Mockito.spy(calculadora);
    }
    @Test
    public void cuandoIngresa5EntoncesRetornaV(){
        //arrange
        Mockito.when(calculadora.mapNumber(Mockito.anyInt())).thenReturn("V");
        String respuesta = calculadora.calcular(5);
       assertThat(respuesta, equalTo("V"));
    }

    @Test
    public void cuandoIngresa1EntoncesRetornaI(){
        String respuesta = calculadora.calcular(1);
        assertThat(respuesta, equalTo("I"));
    }

}