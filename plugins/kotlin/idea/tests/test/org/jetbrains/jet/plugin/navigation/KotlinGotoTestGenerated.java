/*
 * Copyright 2010-2015 JetBrains s.r.o.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.jetbrains.jet.plugin.navigation;

import com.intellij.testFramework.TestDataPath;
import org.jetbrains.jet.JUnit3RunnerWithInners;
import org.jetbrains.jet.JetTestUtils;
import org.jetbrains.jet.test.InnerTestClasses;
import org.jetbrains.jet.test.TestMetadata;
import org.junit.runner.RunWith;

import java.io.File;
import java.util.regex.Pattern;

/** This class is generated by {@link org.jetbrains.kotlin.generators.tests.TestsPackage}. DO NOT MODIFY MANUALLY */
@SuppressWarnings("all")
@InnerTestClasses({KotlinGotoTestGenerated.GotoClass.class, KotlinGotoTestGenerated.GotoSymbol.class})
@RunWith(JUnit3RunnerWithInners.class)
public class KotlinGotoTestGenerated extends AbstractKotlinGotoTest {
    @TestMetadata("idea/testData/navigation/gotoClass")
    @TestDataPath("$PROJECT_ROOT")
    @RunWith(JUnit3RunnerWithInners.class)
    public static class GotoClass extends AbstractKotlinGotoTest {
        public void testAllFilesPresentInGotoClass() throws Exception {
            JetTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("idea/testData/navigation/gotoClass"), Pattern.compile("^(.+)\\.kt$"), true);
        }

        @TestMetadata("enumEntries.kt")
        public void testEnumEntries() throws Exception {
            String fileName = JetTestUtils.navigationMetadata("idea/testData/navigation/gotoClass/enumEntries.kt");
            doClassTest(fileName);
        }

        @TestMetadata("inClassObject.kt")
        public void testInClassObject() throws Exception {
            String fileName = JetTestUtils.navigationMetadata("idea/testData/navigation/gotoClass/inClassObject.kt");
            doClassTest(fileName);
        }

        @TestMetadata("innerClass.kt")
        public void testInnerClass() throws Exception {
            String fileName = JetTestUtils.navigationMetadata("idea/testData/navigation/gotoClass/innerClass.kt");
            doClassTest(fileName);
        }

        @TestMetadata("localDeclarations.kt")
        public void testLocalDeclarations() throws Exception {
            String fileName = JetTestUtils.navigationMetadata("idea/testData/navigation/gotoClass/localDeclarations.kt");
            doClassTest(fileName);
        }

        @TestMetadata("noImplementationTrait.kt")
        public void testNoImplementationTrait() throws Exception {
            String fileName = JetTestUtils.navigationMetadata("idea/testData/navigation/gotoClass/noImplementationTrait.kt");
            doClassTest(fileName);
        }

        @TestMetadata("simpleClass.kt")
        public void testSimpleClass() throws Exception {
            String fileName = JetTestUtils.navigationMetadata("idea/testData/navigation/gotoClass/simpleClass.kt");
            doClassTest(fileName);
        }

        @TestMetadata("simpleObject.kt")
        public void testSimpleObject() throws Exception {
            String fileName = JetTestUtils.navigationMetadata("idea/testData/navigation/gotoClass/simpleObject.kt");
            doClassTest(fileName);
        }

        @TestMetadata("traitWithFunImplement.kt")
        public void testTraitWithFunImplement() throws Exception {
            String fileName = JetTestUtils.navigationMetadata("idea/testData/navigation/gotoClass/traitWithFunImplement.kt");
            doClassTest(fileName);
        }
    }

    @TestMetadata("idea/testData/navigation/gotoSymbol")
    @TestDataPath("$PROJECT_ROOT")
    @RunWith(JUnit3RunnerWithInners.class)
    public static class GotoSymbol extends AbstractKotlinGotoTest {
        public void testAllFilesPresentInGotoSymbol() throws Exception {
            JetTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("idea/testData/navigation/gotoSymbol"), Pattern.compile("^(.+)\\.kt$"), true);
        }

        @TestMetadata("functions.kt")
        public void testFunctions() throws Exception {
            String fileName = JetTestUtils.navigationMetadata("idea/testData/navigation/gotoSymbol/functions.kt");
            doSymbolTest(fileName);
        }

        @TestMetadata("javaMethods.kt")
        public void testJavaMethods() throws Exception {
            String fileName = JetTestUtils.navigationMetadata("idea/testData/navigation/gotoSymbol/javaMethods.kt");
            doSymbolTest(fileName);
        }

        @TestMetadata("properties.kt")
        public void testProperties() throws Exception {
            String fileName = JetTestUtils.navigationMetadata("idea/testData/navigation/gotoSymbol/properties.kt");
            doSymbolTest(fileName);
        }

        @TestMetadata("stdLibArrayListOf.kt")
        public void testStdLibArrayListOf() throws Exception {
            String fileName = JetTestUtils.navigationMetadata("idea/testData/navigation/gotoSymbol/stdLibArrayListOf.kt");
            doSymbolTest(fileName);
        }

        @TestMetadata("stdLibArrayListOfNoSources.kt")
        public void testStdLibArrayListOfNoSources() throws Exception {
            String fileName = JetTestUtils.navigationMetadata("idea/testData/navigation/gotoSymbol/stdLibArrayListOfNoSources.kt");
            doSymbolTest(fileName);
        }

        @TestMetadata("stdLibJoinToString.kt")
        public void testStdLibJoinToString() throws Exception {
            String fileName = JetTestUtils.navigationMetadata("idea/testData/navigation/gotoSymbol/stdLibJoinToString.kt");
            doSymbolTest(fileName);
        }
    }
}
