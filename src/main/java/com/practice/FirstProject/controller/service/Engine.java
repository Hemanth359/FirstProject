package com.practice.FirstProject.controller.service;

import org.springframework.beans.factory.annotation.Autowired;

public class Engine {
	    void start() {
	        System.out.println("Engine started");
	    }

		public Engine(int a) {
			super();
		}

		//Calc obj=new Calc();
	    
	}

	class Car {
	     Engine engine = new Engine(3); // tightly coupled
	     
	     @Autowired
	     Engine obj;   //loose coupling
	     
	     
	     
	     int a=19;

	    void drive() {
	        engine.start();
	        obj.start();
	        System.out.println("Car is moving");
	    }
	}

