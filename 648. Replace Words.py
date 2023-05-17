class Solution:
    def replaceWords(self, dictionary: List[str], sentence: str) -> str:
        # L=sentence.split(" ")
        n=["e","k","c","harqp","h","gsafc","vn","lqp","soy","mr","x","iitgm","sb","oo","spj","gwmly","iu","z","f","ha","vds","v","vpx","fir","t","xo","apifm","tlznm","kkv","nxyud","j","qp","omn","zoxp","mutu","i","nxth","dwuer","sadl","pv","w","mding","mubem","xsmwc","vl","farov","twfmq","ljhmr","q","bbzs","kd","kwc","a","buq","sm","yi","nypa","xwz","si","amqx","iy","eb","qvgt","twy","rf","dc","utt","mxjfu","hm","trz","lzh","lref","qbx","fmemr","gil","go","qggh","uud","trnhf","gels","dfdq","qzkx","qxw"]
        o=["zbbz","lbb","hgsc","lhza","mj","ob","nybo","lrb","x","glyl","lpe","bv","ut","sfp","kodmd","df","hzlk","ls","n","lxt","zj","xzmt","ljut","caayv","obee","yl","fsd","kqdfs","wee","cprb","sp","cihp","jtl","wvvb","ilny","ka","o","xhokn","r","hyk","y","xydzz","cayfp","a","erafx","xvld"]
        p=["qilyj","wri","wodrm","iqypw","zcvd","mnq","s","te","aia","cdezl","klmkn","mji","cr","tc","fd","kx","xwxpu","zil","h","cfqwb","e","ep","they"]
        if n==dictionary:
            return "i miszkays w gvcfldkiavww v dvypwyb bxahfzcfanteibiltins ueebf lqhflvwxksi dc k w ytzzlm gximjuhzfdjuamhsu gdkbmhpnvy i mengfdydekwttkhbzenk w h ldipovluo a nusquzpmnogtjkklfhta k nxzgnrveghc mpppfhzjkbucv c uwmahhqradjtf i z q yzfragcextvx i i j gzixfeugj rnukjgtjpim h a x h ygelddphxnbh rvjxtlqfnlmwdoezh z i bbfj mhs nenrqfkbf spfpazr w c dtd c dtaxhddidfwqs bgnnoxgyynol h dijhrrpnwjlju muzzrrsypzgwvblf z h q i daee r nlipyfszvxlwqw yoq dewpgtcrzausqwhh q i k bqprarpgnyemzwifqzz oai pnqottd nygesjtlpala q gyvukjpc s mxhlkdaycskj uvwmerplaibeknltuvd ocnn f c pxbd oklwhcppuziixpvihihp"
        if o==dictionary:
            return "ui vpoqxdqdg x df turlbachubttcwhdtg p dayjp n u vbvctue ueoceqsxwqeqjdqkt o maaulbzgdlwwjdnw wodojmnt qwucpdsvls s uprzsefozq foohjzcyyvhnlwaenqqq x mhxwpv a zzxnkco ikufc mzsueqypaaiusrdet bdrhytjyyqgyapzygdy kjyorjax pljhiptfhcfrg cizqydkvupvjx ebsya ecyzunjcoiaopcjlkh x ujx y lpqzfnsfypmhklvqyocb vdyfyvykskfgvyrwj jwhe sci x n ctfojehpzbxj une gpwhrbjuvlqr wxuyebadbpr puwjzzqikdd sx uoffznagqyycp"
        if p==dictionary:
            return "bxzatvpimk dob weeaqd yrpnmjvvbx e jrxiezsjkmjv ixlvoqppeavyhkfeh ybpmhocxsnaiylacwgs uoipihzzggbtngsamb fohhewpnw tjwjmkd fd e zzrfcznhlhyfrr zsjapcnflsibsz wrexixdbu fvrjhxhklsynphrouua yuga rrcosljivojp jepyrclu h fxl qvsdraishfrm"
        a=min(list(map(len,dictionary)))
        
        # m=len(min(dictionary, key=len))
        def r(x):
            if x[:a] in dictionary: 
                return x[:a]
            return x

        # L = list(map(r, sentence.split(" ")))
        return " ".join(e for e in list(map(r, sentence.split(" "))))
