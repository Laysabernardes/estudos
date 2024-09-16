using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace projCoisaMVC
{
    internal class Coisas
    {
        #region Atributos
        private Coisa[] asCoisas;
        private int max;
        private int qtde;
        #endregion

        #region Propriedades
        public int Max { get => max; }
        public int Qtde { get => qtde; }
        internal Coisa[] AsCoisas { get => asCoisas; }
        #endregion

        #region Construtores
        public Coisas(int max)
        {
            this.max = max;
            this.qtde = 0;
            this.asCoisas = new Coisa[max];
            for (int i = 0; i < this.max; i++)
            {
                this.asCoisas[i] = new Coisa(-1, "");
            }
        }
        #endregion

        #region Métodos
        public string mostrar()
        {
            string ret = "";
            foreach (Coisa co in this.asCoisas)
            {
                if (co.Id != -1)
                {
                    ret += co.ToString();
                }
            }
            /*
            for(int i=0; i<this.qtde; ++i)
            {
                ret += this.AsCoisas[i].ToString();
            }
            */
            return ret;
        }
        public bool adicionar(Coisa c)
        {
            bool podeAdicionar = (this.qtde < this.max);
            if (podeAdicionar)
            {
                this.asCoisas[this.qtde] = c;
                this.qtde++;
            }
            return podeAdicionar;
        }

        public Coisa pesquisar(Coisa c)
        {
            Coisa coisaAchada = new Coisa(-1, "");
            /*
            int i = 0;
            while (i < this.max && this.asCoisas[i].Id != c.Id)
            {
                i++;
            }
            if (i<this.max)
            {
                coisaAchada = this.asCoisas[i];
            }
            */
            foreach (Coisa co in this.asCoisas)
            {
                if (co.Equals(c))
                {
                    coisaAchada = co;
                    break;
                }
            }
            return coisaAchada;
        }

        public bool remover(Coisa c)
        {
           // bool removido = false;
           // for (int i = 0; i < this.qtde; i++)
           // {
           //     if (this.asCoisas[i].Equals(c))
           //     {
           //         // Move todos os itens na sequencia para uma posição para a esquerda
           //         for (int j = i; j < this.qtde - 1; j++)
           //         {
           //             this.asCoisas[j] = this.asCoisas[j + 1];
           //         }
           //         // Atualiza o último item para um novo objeto vazio
           //         this.asCoisas[this.qtde - 1] = new Coisa(-1, "");
           //         this.qtde--; // Diminui a quantidade de itens
           //         removido = true;
           //         break;
           //     }
           // }
           // return removido;

            // Usando LINQ para criar um novo array sem o item a ser removido
             var novoArray = asCoisas.Where(x => !x.Equals(c)).ToArray(); 
             if (novoArray.Length < asCoisas.Length)
             {
                 asCoisas = novoArray;
                 qtde = novoArray.Length;
                 return true;
             }
             return false;
        }

        #endregion




    }
}