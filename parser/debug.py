from c.Tree import TreeParser
treeParser = TreeParser()
filePath = './input/test/test.c'
# filePath = './input/c/hello.c'
funcObjs = treeParser.ParseFile(filePath)
for func in funcObjs:
    print(func.name)