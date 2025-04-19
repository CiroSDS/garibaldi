@Service
public class CadastroProdutoApplication {
    
    @Autowired
    private ProdutoRepository produtoRepository;
    
    public Produto cadastrarProduto(Produto produto) {
        return produtoRepository.save(produto);
    }
}