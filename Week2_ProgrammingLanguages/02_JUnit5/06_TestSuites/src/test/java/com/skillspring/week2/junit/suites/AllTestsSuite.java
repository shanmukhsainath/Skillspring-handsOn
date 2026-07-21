package com.skillspring.week2.junit.suites;

import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;

@Suite
@SelectClasses({MathServiceTest.class, TextServiceTest.class})
class AllTestsSuite {
}
