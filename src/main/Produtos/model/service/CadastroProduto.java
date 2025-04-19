@Service
public class CadastroProduto {
    
    @Autowired
    private ProdutoRepository produtoRepository;
    
    public Produto cadastrarProduto(Produto produto) {
        return produtoRepository.save(produto);
    }
}