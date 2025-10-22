const shoot3=(a,b)=>{
    alert(b)
}

export default function Event3() {
    return (
        <div>
         <button onClick={()=>{{shoot3("goalll","Golazo")}}}>Take the shot</button>
        </div>
    );
}