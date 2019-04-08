grammar Choice;
choice: root;

WS: [ \t\r] -> skip;
TRUE: 'true';
FALSE: 'false';
ROOT_KEY: 'root';
HERE_KEY: 'here';
BOOLEAN_OPERATOR: '>' | '>=' | '<' | '<=' | '==' | '!=';
THEN: '-then->';
IF_PREFIX: '-if(';
SWITCH_PREFIX: '-switch(';
SELECTOR_SUFFIX: ')->';
ELSE: '-else->';
ROOT_START: '=>';
BRANCH_START: '->';
VAR_START: '~>';
NEST_START: '{';
NEST_END: '};';
INTEGER: ([0-9]) | [1-9][0-9]*;
TEXT_CHARACTER_RESTRICTED: CHAR | INTEGER;
TEXT_CHARACTER: (CHAR | INTEGER | [- ?!(){}'/$#.,:+%^*@\\~|£<>]);
STRING: '"' (TEXT_CHARACTER | ';')+ '"';
CHAR: [A-z];
FLOAT: ([0] | [1-9][0-9]*) ('.' INTEGER [1-9]*)?;
WHITESPACE: (' '|'\t');
NEWLINE: ('\r'?'\n'|'\r');
STATEMENT_END: ';';
EMPTY_STRING: '""';
METHOD: '#' TEXT_CHARACTER_RESTRICTED+;

float: FLOAT;
integer: INTEGER;
number: ('-')? (integer | float);
boolean: TRUE | FALSE;

branchName: STRING;
switchCase: STRING;
branchDisplay: STRING;
string: STRING;

arrayOfValues: '[' commaSeparatedVariables ']';
commaSeparatedVariables: (simpleVariable (',' simpleVariable)*);
simpleVariable: (boolean | string | number | ('-')? variableKeywords);
variable: simpleVariable | arrayOfValues;
method: ('-')? (methodWithoutParams | methodWithParams) methodInnerVariable*?;
methodInnerVariable: ('.' TEXT_CHARACTER_RESTRICTED+);
methodWithoutParams: METHOD;
methodWithParams: METHOD '(' (variable | commaSeparatedVariables | method) ')';
methods: method (',' method)*?;
booleanExpression: boolean | simpleBooleanExpression | reversedBoolean;
simpleBooleanExpression: (number | method) BOOLEAN_OPERATOR (number | method);
reversedBoolean: '!('  simpleBooleanExpression ')';

variableKeywords: (HERE_KEY | ROOT_KEY) variableKeywordInnerVariable*?;
variableKeywordInnerVariable: ('.' TEXT_CHARACTER_RESTRICTED+);

content: (NEWLINE | branch | branchVar | selector)*;
elseContent: (NEWLINE | branch | branchVar | selector)*;
rootStart: ROOT_START variable? NEST_START NEWLINE;
nestEnd: NEST_END;
root: rootStart content nestEnd;

branchVariableOrMethod: (variable | methods | variable THEN methods);
branch: simpleBranch | blankBranch | nestingBranch | ifBranchTernary;
blankBranch: BRANCH_START branchName (',' branchDisplay)? '~' STATEMENT_END? NEWLINE;
simpleBranch: BRANCH_START branchName (',' branchDisplay)? '~' branchVariableOrMethod? STATEMENT_END NEWLINE;
nestingBranch: BRANCH_START branchName (',' branchDisplay)? '~' branchVariableOrMethod? NEST_START NEWLINE content nestEnd;
switchBranch: switchBranchNormal | switchBlankBranch;
switchBranchNormal: switchCase branch;
switchBlankBranch: switchCase BRANCH_START '~';
ifBranchTernary: BRANCH_START booleanExpression branch;

branchVar: branchSimpleVar | branchNestingVar;
branchSimpleVar: VAR_START variable STATEMENT_END NEWLINE;
branchNestingVar: VAR_START simpleNest;
simpleNest: NEST_START NEWLINE branchNestingVarContent nestEnd;
varNest: NEST_START NEWLINE branchNestingVarContent '}';
branchNestingVarContent: (keyValuePair | NEWLINE)*;
key: TEXT_CHARACTER_RESTRICTED+;
value: (simpleVariable | varNest | arrayOfValues);
keyValuePair: key ':' value ',' NEWLINE;

selector: if | switch;
switch: '-switch(' (variable | method | variableKeywords) ')->' NEST_START switchContent nestEnd;
switchContent: (NEWLINE | switchBranch)*;
if: normalIf | ifElse;
normalIf: '-if(' (booleanExpression | variableKeywords) ')->' NEST_START content nestEnd;
ifElse: '-if(' (booleanExpression | variableKeywords) ')->' NEST_START content '}' ELSE NEST_START elseContent nestEnd;