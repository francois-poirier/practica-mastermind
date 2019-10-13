package mastermind.controllers.implementation;

import mastermind.controllers.SaveController;
import mastermind.models.Session;
import mastermind.models.SessionImplementation;

public class SaveControllerImplementation extends SaveController {

    public SaveControllerImplementation(Session session) {
        super(session);
    }

    @Override
    public void save(String name) {
        ((SessionImplementation) this.session).save(name);
    }

    @Override
    public void save() {
        ((SessionImplementation) this.session).save();
    }

    @Override
    public void next() {
        ((SessionImplementation) this.session).next();
    }

    @Override
    public boolean hasName() {
        return ((SessionImplementation) this.session).hasName();
    }

    @Override
    public boolean exists(String name) {
        return ((SessionImplementation) this.session).exists(name);
    }

}