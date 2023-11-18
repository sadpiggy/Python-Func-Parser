这是一个用于函数分析的项目，目前支持的语言[`python`,`java`,`c/c++`]，以函数的粒度生成代码特征。并支持生成[`cfg`,`cpg`,`dpg`]（依赖于joern https://docs.joern.io/ ）

## requirement
+ antlr4-python3-runtime
+ joern
+ graphviz

## 环境

+ python环境配置

  ```
    conda create -n anyname python=3.8
    source activate anyname
    pip install antlr4-python3-runtime
  ```

+ joern环境配置

  ```
  mkdir joern && cd joern # optional
  curl -L "https://github.com/joernio/joern/releases/latest/download/joern-install.sh" -o joern-install.sh
  chmod u+x joern-install.sh
  ./joern-install.sh --interactive
  ```

  + and follow the installer instructions. By default, joern will be installed at `~/bin/joern`

+ graphviz配置

  + 安装graphviz

    ```
    sudo apt-get install graphviz libgraphviz-dev pkg-config
    ```

  + 在python中安装graphviz接口

    ```
    pip install graphviz
    ```

    
+ 如果遇到一些库没有下载的情况，可以手动下载未安装的库
+ 其他版本的python可能也可以使用

## 运行
+ sh run.sh

+ 运行命令

  ```
  python3 CParser.py <repoPath> <concurrent_size> <finalResultPath> <targetLanguage>=[cpp/c,java,python] <cfg>=[none,cfg,cpg,dpg]
  ```

  + \<cfg\>项可以省略，即不生成[none,cfg,cpg,dpg]

+ use case

  ```
  python parser/MultiLanguageParser.py ./input/python 1 output python cpg
  ```

  ```
  python parser/MultiLanguageParser.py ./input/python 1 output python
  ```

+ 注意，生成[cfg,cpg,dpg]十分耗时（耗时**函数分析**的百倍以上）

  + 函数分析`openssl`项目，十二线程需要50s（AMD Ryzen 7 5800H）


