package com.example.sasha.okhear_new.symbols_processing;

import org.androidannotations.annotations.EBean;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@EBean(scope = EBean.Scope.Singleton)
public class SymbolsProcessingController {

    private Map<Character, SymbolValidator> symbolValidators = new HashMap<>();

    private SymbolValidator zeroValidator = new SymbolValidator() {
        @Override
        public boolean isSymbolValid(List<Character> sortedSymbols, boolean isFrontCamera) {
            return false;
        }
    };
    
    private SymbolValidator oneValidator = new SymbolValidator() {
        @Override
        public boolean isSymbolValid(List<Character> sortedSymbols, boolean isFrontCamera) {
            return false;
        }
    };

    private SymbolValidator twoValidator = new SymbolValidator() {
        @Override
        public boolean isSymbolValid(List<Character> sortedSymbols, boolean isFrontCamera) {
            return false;
        }
    };

    private SymbolValidator threeValidator = new SymbolValidator() {
        @Override
        public boolean isSymbolValid(List<Character> sortedSymbols, boolean isFrontCamera) {
            return false;
        }
    };

    private SymbolValidator fourValidator = new SymbolValidator() {
        @Override
        public boolean isSymbolValid(List<Character> sortedSymbols, boolean isFrontCamera) {
            return false;
        }
    };

    private SymbolValidator fiveValidator = new SymbolValidator() {
        @Override
        public boolean isSymbolValid(List<Character> sortedSymbols, boolean isFrontCamera) {
            return false;
        }
    };

    private SymbolValidator sixValidator = new SymbolValidator() {
        @Override
        public boolean isSymbolValid(List<Character> sortedSymbols, boolean isFrontCamera) {
            return false;
        }
    };

    private SymbolValidator sevenValidator = new SymbolValidator() {
        @Override
        public boolean isSymbolValid(List<Character> sortedSymbols, boolean isFrontCamera) {
            return false;
        }
    };

    private SymbolValidator eightValidator = new SymbolValidator() {
        @Override
        public boolean isSymbolValid(List<Character> sortedSymbols, boolean isFrontCamera) {
            return false;
        }
    };

    private SymbolValidator nineValidator = new SymbolValidator() {
        @Override
        public boolean isSymbolValid(List<Character> sortedSymbols, boolean isFrontCamera) {
            return false;
        }
    };

    private SymbolValidator aValidator = new SymbolValidator() {
        @Override
        public boolean isSymbolValid(List<Character> sortedSymbols, boolean isFrontCamera) {
            return false;
        }
    };

    private SymbolValidator beValidator = new SymbolValidator() {
        @Override
        public boolean isSymbolValid(List<Character> sortedSymbols, boolean isFrontCamera) {
            return false;
        }
    };

    private SymbolValidator veValidator = new SymbolValidator() {
        @Override
        public boolean isSymbolValid(List<Character> sortedSymbols, boolean isFrontCamera) {
            return false;
        }
    };

    private SymbolValidator geValidator = new SymbolValidator() {
        @Override
        public boolean isSymbolValid(List<Character> sortedSymbols, boolean isFrontCamera) {
            return false;
        }
    };

    private SymbolValidator deValidator = new SymbolValidator() {
        @Override
        public boolean isSymbolValid(List<Character> sortedSymbols, boolean isFrontCamera) {
            return false;
        }
    };

    private SymbolValidator eValidator = new SymbolValidator() {
        @Override
        public boolean isSymbolValid(List<Character> sortedSymbols, boolean isFrontCamera) {
            return false;
        }
    };

    private SymbolValidator jeValidator = new SymbolValidator() {
        @Override
        public boolean isSymbolValid(List<Character> sortedSymbols, boolean isFrontCamera) {
            return false;
        }
    };

    private SymbolValidator zeValidator = new SymbolValidator() {
        @Override
        public boolean isSymbolValid(List<Character> sortedSymbols, boolean isFrontCamera) {
            return false;
        }
    };

    private SymbolValidator iValidator = new SymbolValidator() {
        @Override
        public boolean isSymbolValid(List<Character> sortedSymbols, boolean isFrontCamera) {
            return false;
        }
    };

    private SymbolValidator ikratkayaValidator = new SymbolValidator() {
        @Override
        public boolean isSymbolValid(List<Character> sortedSymbols, boolean isFrontCamera) {
            return false;
        }
    };

    private SymbolValidator kValidator = new SymbolValidator() {
        @Override
        public boolean isSymbolValid(List<Character> sortedSymbols, boolean isFrontCamera) {
            return false;
        }
    };

    private SymbolValidator lValidator = new SymbolValidator() {
        @Override
        public boolean isSymbolValid(List<Character> sortedSymbols, boolean isFrontCamera) {
            return false;
        }
    };

    private SymbolValidator mValidator = new SymbolValidator() {
        @Override
        public boolean isSymbolValid(List<Character> sortedSymbols, boolean isFrontCamera) {
            return false;
        }
    };

    private SymbolValidator nValidator = new SymbolValidator() {
        @Override
        public boolean isSymbolValid(List<Character> sortedSymbols, boolean isFrontCamera) {
            return false;
        }
    };

    private SymbolValidator oValidator = new SymbolValidator() {
        @Override
        public boolean isSymbolValid(List<Character> sortedSymbols, boolean isFrontCamera) {
            return false;
        }
    };

    private SymbolValidator pValidator = new SymbolValidator() {
        @Override
        public boolean isSymbolValid(List<Character> sortedSymbols, boolean isFrontCamera) {
            return false;
        }
    };

    private SymbolValidator rValidator = new SymbolValidator() {
        @Override
        public boolean isSymbolValid(List<Character> sortedSymbols, boolean isFrontCamera) {
            return false;
        }
    };

    private SymbolValidator sValidator = new SymbolValidator() {
        @Override
        public boolean isSymbolValid(List<Character> sortedSymbols, boolean isFrontCamera) {
            return false;
        }
    };

    private SymbolValidator tValidator = new SymbolValidator() {
        @Override
        public boolean isSymbolValid(List<Character> sortedSymbols, boolean isFrontCamera) {
            return false;
        }
    };

    private SymbolValidator uValidator = new SymbolValidator() {
        @Override
        public boolean isSymbolValid(List<Character> sortedSymbols, boolean isFrontCamera) {
            return false;
        }
    };

    private SymbolValidator fValidator = new SymbolValidator() {
        @Override
        public boolean isSymbolValid(List<Character> sortedSymbols, boolean isFrontCamera) {
            return false;
        }
    };

    private SymbolValidator hValidator = new SymbolValidator() {
        @Override
        public boolean isSymbolValid(List<Character> sortedSymbols, boolean isFrontCamera) {
            return false;
        }
    };

    private SymbolValidator ceValidator = new SymbolValidator() {
        @Override
        public boolean isSymbolValid(List<Character> sortedSymbols, boolean isFrontCamera) {
            return false;
        }
    };

    private SymbolValidator cheValidator = new SymbolValidator() {
        @Override
        public boolean isSymbolValid(List<Character> sortedSymbols, boolean isFrontCamera) {
            return false;
        }
    };

    private SymbolValidator shValidator = new SymbolValidator() {
        @Override
        public boolean isSymbolValid(List<Character> sortedSymbols, boolean isFrontCamera) {
            return false;
        }
    };

    private SymbolValidator iiValidator = new SymbolValidator() {
        @Override
        public boolean isSymbolValid(List<Character> sortedSymbols, boolean isFrontCamera) {
            return false;
        }
    };

    private SymbolValidator znakValidator = new SymbolValidator() {
        @Override
        public boolean isSymbolValid(List<Character> sortedSymbols, boolean isFrontCamera) {
            return false;
        }
    };

    private SymbolValidator aeValidator = new SymbolValidator() {
        @Override
        public boolean isSymbolValid(List<Character> sortedSymbols, boolean isFrontCamera) {
            return false;
        }
    };

    private SymbolValidator yuValidator = new SymbolValidator() {
        @Override
        public boolean isSymbolValid(List<Character> sortedSymbols, boolean isFrontCamera) {
            return false;
        }
    };

    private SymbolValidator yaValidator = new SymbolValidator() {
        @Override
        public boolean isSymbolValid(List<Character> sortedSymbols, boolean isFrontCamera) {
            int symbolPos = sortedSymbols.indexOf('Я');
            if (sortedSymbols.indexOf('В') < symbolPos
                    || sortedSymbols.indexOf('З') <= 3 && sortedSymbols.indexOf('З') < symbolPos) {
                return false;
            }
            if (isFrontCamera) {
                if (sortedSymbols.indexOf('П') <= 1
                        || sortedSymbols.indexOf('К') <= 3 && sortedSymbols.indexOf('К') < symbolPos) {
                    return false;
                }
                return symbolPos <= 5;
            } else {
                return symbolPos <= 3;
            }
        }
    };

    {
        symbolValidators.put('0', zeroValidator);
        symbolValidators.put('1', oneValidator);
        symbolValidators.put('2', twoValidator);
        symbolValidators.put('3', threeValidator);
        symbolValidators.put('4', fourValidator);
        symbolValidators.put('5', fiveValidator);
        symbolValidators.put('6', sixValidator);
        symbolValidators.put('7', sevenValidator);
        symbolValidators.put('8', eightValidator);
        symbolValidators.put('9', nineValidator);
        symbolValidators.put('А', aValidator);
        symbolValidators.put('Б', beValidator);
        symbolValidators.put('В', veValidator);
        symbolValidators.put('Г', geValidator);
        symbolValidators.put('Д', deValidator);
        symbolValidators.put('Е', eValidator);
        symbolValidators.put('Ж', jeValidator);
        symbolValidators.put('З', zeValidator);
        symbolValidators.put('И', iValidator);
        symbolValidators.put('Й', ikratkayaValidator);
        symbolValidators.put('К', kValidator);
        symbolValidators.put('Л', lValidator);
        symbolValidators.put('М', mValidator);
        symbolValidators.put('Н', nValidator);
        symbolValidators.put('О', oValidator);
        symbolValidators.put('П', pValidator);
        symbolValidators.put('Р', rValidator);
        symbolValidators.put('С', sValidator);
        symbolValidators.put('Т', tValidator);
        symbolValidators.put('У', uValidator);
        symbolValidators.put('Ф', fValidator);
        symbolValidators.put('Х', hValidator);
        symbolValidators.put('Ц', ceValidator);
        symbolValidators.put('Ч', cheValidator);
        symbolValidators.put('Ш', shValidator);
        symbolValidators.put('Ы', iiValidator);
        symbolValidators.put('Ь', znakValidator);
        symbolValidators.put('Э', aeValidator);
        symbolValidators.put('Ю', yuValidator);
        symbolValidators.put('Я', yaValidator);
    }

    public boolean isSymbolValid(char symbol, String sortedSymbolsString, boolean isFrontCamera) {
        SymbolValidator validator = symbolValidators.get(symbol);
        List<Character> sortedSymbols = new ArrayList<>();
        for (char c : sortedSymbolsString.toCharArray()) {
            sortedSymbols.add(c);
        }
        return validator.isSymbolValid(sortedSymbols, isFrontCamera);
    }
    
    private interface SymbolValidator {
        boolean isSymbolValid(List<Character> sortedSymbols, boolean isFrontCamera);
    }
}
