const shoot2=(a)=>{
    alert(a)
}

export default function Event2() {
    return (
        <div>
         <button onClick={()=>{shoot2("goalll")}}>Take the shot</button>
        </div>
    );
}