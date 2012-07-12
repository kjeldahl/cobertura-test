package it.kjeldahl.cobertura;

import static org.junit.Assert.*;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;

import org.junit.Test;
import org.objectweb.asm.ClassReader;
import org.objectweb.asm.ClassVisitor;
import org.objectweb.asm.commons.AdviceAdapter;
import org.objectweb.asm.util.TraceClassVisitor;

public class ClassReaderTest {

	//@Test
	public void test() throws IOException {

		dumpClass(new File("eclipse/it/kjeldahl/cobertura/ProcessorTest.class"));
		dumpClass(new File("build/instrumentedclasses/it/kjeldahl/cobertura/ProcessorTest.class"));
	}

	private void dumpClass(File file) throws FileNotFoundException, IOException {
		System.out.println("Dumping file: "+file.getCanonicalPath());

		InputStream inputStream = null;
		ClassVisitor cv;
		try
		{
			inputStream = new FileInputStream(file);
			ClassReader cr = new ClassReader(inputStream);
			cv = new TraceClassVisitor(new PrintWriter(System.out));
			cr.accept(cv, 0);
		}
		finally
		{
			inputStream.close();
		}
	}

}
