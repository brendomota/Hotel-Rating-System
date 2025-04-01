package br.unesp.rc.testeprojeto.utilitario;

import org.kie.api.KieServices;
import org.kie.api.builder.KieBuilder;
import org.kie.api.builder.KieFileSystem;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;
import org.kie.internal.io.ResourceFactory;

/**
 *
 * @author User
 */
public class GeradorDrools {
    
    private String endereco;
    private KieSession kses;

    public GeradorDrools() {
    }

    public GeradorDrools(String endereco) {
        this.endereco = endereco;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public KieSession getKses() {
        return kses;
    }

    public void configurar() {
        KieServices ks = KieServices.Factory.get();
        KieFileSystem kfs = ks.newKieFileSystem();

        kfs.write(ResourceFactory.newClassPathResource(endereco));

        KieBuilder kb = ks.newKieBuilder(kfs);
        kb.buildAll();

        if (kb.getResults().hasMessages(org.kie.api.builder.Message.Level.ERROR)) {
            throw new RuntimeException("Build Errors:\n" + kb.getResults().toString());
        }

        KieContainer kContainer = ks.newKieContainer(ks.getRepository().getDefaultReleaseId());
        KieSession kSession = kContainer.newKieSession();

        this.kses = kSession;
    }

    public void adicionarObjeto(Object o) {
        kses.insert(o);
    }

    public void executarRegra() {
        kses.fireAllRules();
    }
}
