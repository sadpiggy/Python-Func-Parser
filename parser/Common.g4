grammar Common;

@parser::members {

def skipToEndOfObject(self):
    CurlyStack = []
    o = object()
    t = self._input.LA(1)

    while t  and not (not CurlyStack and t == self.CLOSING_CURLY):
        if t == self.PRE_ELSE:
            ifdefStack = []
            self.consume()
            t = self._input.LA(1)

            while t  and not (not ifdefStack and t == self.PRE_ENDIF):
                if t == self.PRE_IF:
                    ifdefStack.append(o)
                elif t == self.PRE_ENDIF:
                    ifdefStack.pop()
                self.consume()
                t = self._input.LA(1)

        if t == self.OPENING_CURLY:
            CurlyStack.append(o)
        elif t == self.CLOSING_CURLY:
            CurlyStack.pop()

        self.consume()
        t = self._input.LA(1)

    if t :
        self.consume()

    return True

def preProcSkipToEnd(self):
    CurlyStack = []
    o = object()
    t = self._input.LA(1)

    while t and not (not CurlyStack and t == self.PRE_ENDIF):
        if t == self.PRE_IF:
            CurlyStack.append(o)
        elif t == self.PRE_ENDIF:
            CurlyStack.pop()

        self.consume()
        t = self._input.LA(1)

    if t:
        self.consume()

    return True
}

unary_operator : '&' | '*' | '+'| '-' | '~' | '!';
relational_operator: ('<'|'>'|'<='|'>=');

constant
    :   HEX_LITERAL
    |   OCTAL_LITERAL
    |   DECIMAL_LITERAL
	|	STRING
    |   CHAR
    |   FLOATING_POINT_LITERAL
    ;

// keywords & operators

function_decl_specifiers: ('inline' | 'virtual' | 'explicit' | 'friend' | 'static');
ptr_operator: ('*' | '&');

access_specifier: ('public' | 'private' | 'protected');

operator: (('new' | 'delete' ) ('[' ']')?)
  | '+' | '-' | '*' | '/' | '%' |'^' | '&' | '|' | '~'
  | '!' | '=' | '<' | '>' | '+=' | '-=' | '*='
  | '/=' | '%=' | '^=' | '&=' | '|=' | '>>'
  |'<<'| '>>=' | '<<=' | '==' | '!='
  | '<=' | '>=' | '&&' | '||' | '++' | '--'
  | ',' | '->*' | '->' | '(' ')' | '[' ']'
  ;

assignment_operator: '=' | '*=' | '/=' | '%=' | '+=' | '-=' | '<<=' | '>>=' | '&=' | '^=' | '|='; 
equality_operator: ('=='| '!=');

template_decl_start : TEMPLATE '<' template_param_list '>';


// template water
template_param_list : (('<' template_param_list '>') |
                       ('(' template_param_list ')') | 
                       no_angle_brackets_or_brackets)+
;

// water

no_brackets: ~('(' | ')');
no_brackets_curlies_or_squares: ~('(' | ')' | '{' | '}' | '[' | ']');
no_brackets_or_semicolon: ~('(' | ')' | ';');
no_angle_brackets_or_brackets : ~('<' | '>' | '(' | ')');
no_curlies: ~('{' | '}');
no_squares: ~('[' | ']');
no_squares_or_semicolon: ~('[' | ']' | ';');
no_comma_or_semicolon: ~(',' | ';');

assign_water: ~('(' | ')' | '{' | '}' | '[' | ']' | ';' | ',');
assign_water_l2: ~('(' | ')' | '{' | '}' | '[' | ']');

water: .;
