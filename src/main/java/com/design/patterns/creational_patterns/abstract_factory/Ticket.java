package com.design.patterns.creational_patterns.abstract_factory;

abstract class Ticket {

    public abstract Integer buildTicket();

    public Integer makeTicket(){
        return buildTicket();
    }
}
