package fr.simplifia.transform;

import fr.simplifia.input.validator.SmpInputValidator;

public class SmpDataTransformer {

    private SmpInputValidator validator;
    private static final String MESSAGE = " : bienvenue chez Simplifia!";
    private static final String MSGEN = " : welcome to Simplifia!";
    public SmpDataTransformer(final SmpInputValidator validator) {
        this.validator = validator;

    }

    public String transform(final String input){
        validator.validateInput(input);
        final StringBuffer buffer = new StringBuffer();
        buffer.append(input);
        buffer.append(MESSAGE);
        return buffer.toString();
    }
    public String transformE(final String input){
        validator.validateInput(input);
        final StringBuffer buffer = new StringBuffer();
        buffer.append(input);
        buffer.append(MSGEN);
        return buffer.toString();
    }

}
