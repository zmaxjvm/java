package main.gof.creational.abstractFactory;

import main.gof.creational.factory.objects.Unit;

/**
 * Created by zmax.
 * Abstract factory interface
 */
public interface GamesElementsFactory {
    Unit makeFighter();

    Unit makeWarrior();

    Unit makeArcher();
}