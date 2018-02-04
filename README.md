# testng
### 备注
http://testng.org/doc/documentation-main.html
http://maven.apache.org/surefire/maven-surefire-plugin/examples/testng.html
#### ※ src/main/java 下无法引用 testng jar 包
testng dependedcy 配置如下：
```
<dependency>
    <groupId>org.testng</groupId>
    <artifactId>testng</artifactId>
    <version>${testng.version}</version>
    <scope>test</scope>
</dependency>
```
> This scope indicates that the dependency is not required for normal use of the application, and is only available for the test compilation and execution phases. This scope is not transitive.

scope test 只有在测试编译、执行阶段可用。默认情况，只有 src/test/java 下可以引用。若想讲测试代码写到 src/main/java 下，将`<scope>test</scope>`删除即可（缺省值为 compile）。

参考：[Dependency Scope](https://maven.apache.org/guides/introduction/introduction-to-dependency-mechanism.html)

#### ※ maven-surefire-plugin 与 testng.xml 配置冲突时，实际以 maven-surefire-plugin 中的配置运行
如，maven-surefire-plugin 中 `<groups>all</groups>`，testng.xml 中 `<run><include name="G1"/></run>`，实际执行的 group 为 all

#### ※ testng.xml 中 define 的 group(假设为 all) 不能用于 depends-on
若 all 作为依赖方，执行用例时，不会执行被依赖的 group 中的用例；作为被依赖方，会直接报错`[ERROR] DependencyMap::Method "TestInit.testInit()[pri:0, instance:pkg.one.TestInit@340f438e]" depends on nonexistent group "all"`

#### ※ 处理依赖的方式有很多

#### ※ Class level annotations
目前我们的用例的 @Test 