@RestController
@RequestMapping("/produtos")
public class ProdutoController {
    @Autowired
    private ProdutoService produtoService;

    @PostMapping
    public Produto criarProduto(@RequestBody Produto produto) {
        return produtoService.criarProduto(produto);
    }

    @CrossOrigin
    @GetMapping
    public List<Produto> listarProdutos() {
        return produtoService.listarProdutos();
    }
}