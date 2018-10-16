default: buildAndRun

buildAndRun: build run

build:
	javac -d . source/*.java

run:
	java code.Circles
