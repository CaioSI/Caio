  char primeiracad[] = {'G','C', 'T','A','G','T','G','A','T','A','C','G','G','C','G','A'};   
    char segundacad[] = {'C','G', 'A','T','C','A','C','T','A','T','G','C','C','G','C','T'};
    
    boolean primeiramut = false;
    boolean segundamut = false;
    
    for(int i = 0; i < primeiracad.length; i++){
        if(primeiracad[i] == 'T' && primeiracad[i+1] == 'G'){
            primeiramut = true;
        }
    }
    
    for(int i = 0; i < segundacad.length; i++){
        if(segundacad[i] == 'A' && segundacad[i+1] == 'C'){
            segundamut = true;
        }
    }
    
    if(primeiramut && segundamut){
        System.out.println("Mutação encontrada");
    }
    else{
        System.out.println("DNA normal");
    }
    
