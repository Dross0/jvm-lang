package ru.gaidamaka.jvm.lang.variable;

import ru.gaidamaka.jvm.lang.exception.MissDeclarationException;
import ru.gaidamaka.jvm.lang.exception.MultiplyVariableDeclarationException;

import java.util.HashMap;
import java.util.Map;

public class VariableStorage {
    private final Map<String, VarType> types = new HashMap<>();
    private final Map<String, Integer> ids = new HashMap<>();
    private int varCount = 0;

    public int declare(String varName, VarType type){
        checkMultiplyDeclaration(varName);
        types.put(varName, type);
        ids.put(varName, varCount);
        return varCount++;
    }

    public int getId(String varName){
        checkMissDeclaration(varName);
        return ids.get(varName);
    }

    public boolean isDeclared(String varName) {
        return types.containsKey(varName);
    }

    public VarType getType(String varName){
        checkMissDeclaration(varName);
        return types.get(varName);
    }

    public boolean isType(String varName, VarType type){
        checkMissDeclaration(varName);
        return types.get(varName) == type;
    }

    private void checkMultiplyDeclaration(String varName){
        if (isDeclared(varName)) {
            throw new MultiplyVariableDeclarationException("Multiply declaration of: " + varName);
        }
    }

    private void checkMissDeclaration(String varName){
        if (!isDeclared(varName)) {
            throw new MissDeclarationException("Miss declaration:" + varName);
        }
    }
}
