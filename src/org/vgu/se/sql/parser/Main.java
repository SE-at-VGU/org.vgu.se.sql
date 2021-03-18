/**************************************************************************
Copyright 2019 Vietnamese-German-University

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.

@author: ngpbh
***************************************************************************/

package org.vgu.se.sql.parser;

import java.io.IOException;

import net.sf.jsqlparser.JSQLParserException;
import net.sf.jsqlparser.parser.CCJSqlParserUtil;
import net.sf.jsqlparser.statement.Statement;

public class Main {

    public static void main(String[] args)
        throws IOException, JSQLParserException {
        Statement stm = CCJSqlParserUtil.parseStatements("SELECT * FROM Car")
            .getStatements().get(0);
        sql.Statement estm = SQLParser.transform(stm);
//        SQLParser.saveEStatement("test.xmi", estm);
        System.out.println(SQLParser.outputEStatementAsXMI(estm));
    }
}
